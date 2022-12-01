CLASS=$1
KEY=$2
DATE=`date +%Y%m%d%H%M%S%N`

clID=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignment_groups -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $group( @{$_} ){ if( index( $group->{"name"} , "licker" ) lt 0 ){ next; } printf "%d" , $group->{"id"} }'`

numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/enrollments -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=1
fi
for page in `seq 1 ${numPages}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/enrollments?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ if( $student->{"type"} ne "StudentEnrollment" ){ next; } printf "%d,%.2f\n" , $student->{"user_id"} , $student->{"grades"}->{"unposted_current_score"} }' >> ${DATE}.scores.csv
done

numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=1
fi

for page in `seq 1 ${numPages}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $assignment( @{$_} ){ printf "%d,%d\n" , $assignment->{"assignment_group_id"} , $assignment->{"id"} }' >> ${DATE}.assignments.csv
done

cp ${DATE}.assignments.csv ${DATE}.assignments.original.csv
grep -v -e ^${clID}, ${DATE}.assignments.csv > ${DATE}.assignments.temp
cut -d ',' -f2 ${DATE}.assignments.temp > ${DATE}.assignments.csv

for assignment in `cat ${DATE}.assignments.csv`
do
    numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments/${assignment}/submissions -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d" , $14 }'`
    
    if [ ${numPages} -eq 0 ]
    then
	numPages=1
    fi
    for page in `seq 1 ${numPages}`
    do
	curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments/${assignment}/submissions?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $submission( @{$_} ){ printf "%d,%d\n" , $submission->{"user_id"} , $submission->{"score"} }' &>> ${DATE}.${assignment}.csv
    done
done

for user in `cut -d ',' -f1 ${DATE}.scores.csv`
do
    score=`grep -e ^${user}, ${DATE}.scores.csv | cut -d ',' -f2`
    zeros=`grep -l -e ^${user},0$ ${DATE}*.csv | grep -c -e .`
    echo "${score},${zeros}" >> ${DATE}.data.csv
done

sed "s/DATA/${DATE}.data.csv/g;s/OUTPUT/${DATE}.eps/g" template.plt > ${DATE}.plt
gnuplot ${DATE}.plt
epstopdf ${DATE}.eps
rm -v `ls ${DATE}*.* | grep -v -e pdf$`
