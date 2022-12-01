#!/bin/bash
CLASS=$1 # Canvas class number
ASSIGNMENT=$2 # Canvas assignment number
SURVEY=$3 # CSV of NUID,Score,... form
KEY=$4 # Canvas key

cut -d ',' -f1 ${SURVEY} | sort > ${CLASS}.survey.csv
curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/students -X POST -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none 'for my $student( @{$_} ){ printf "%08d\n" , $student->{"sis_user_id"} ; }' | sort | uniq > ${CLASS}.nuids.csv
echo "NUIDs from class -> NUIDs not matching"
comm -3 ${CLASS}.nuids.csv ${CLASS}.survey.csv
comm -13 ${CLASS}.nuids.csv ${CLASS}.survey.csv > ${CLASS}.not.csv
echo "Lines in survey of NUIDs not matching"
cut -d ',' -f1 ${SURVEY} | grep -n -f ${CLASS}.not.csv
rm ${CLASS}.nuids.csv ${CLASS}.survey.csv ${CLASS}.not.csv

for line in `cat ${SURVEY}`
do 
    nuid=`echo "${line}" | cut -d ',' -f1`
    score=`echo ${line} | cut -d ',' -f2`
    canvas=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/students -X POST -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none 'for my $student( @{$_} ){ printf "%08d\t%d\n" , $student->{"sis_user_id"} , $student->{"id"} ; }' | sort | uniq | grep -e ${nuid} | cut -d ',' -f2`
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments/${ASSIGNMENT}/submissions/update_grades -X POST -H "Authorization: Bearer ${KEY}" -F "grade_data[${canvas}][posted_grade]=${grade}" | json_xs -f json -t none
done
