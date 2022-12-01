#!/bin/bash

CLASS=$1
ASSIGNMENT=$2
KEY=$3

curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments/${ASSIGNMENT} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'my $assignment = $_; printf "Nothing Submitted for %s\n" , $assignment->{"name"};'

numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments/${ASSIGNMENT}/submissions -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d\n" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=1
fi

touch .submission${CLASS}.${ASSIGNMENT}.txt

for page in `seq 1 ${numPages}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments/${ASSIGNMENT}/submissions?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $submission( @{$_} ){ if( !$submission->{"submitted_at"} && !$submission->{"excused"} ){ printf "%s\n" , $submission->{"user_id"} ; } }' >> .submission${CLASS}.${ASSIGNMENT}.txt
done

sort .submission${CLASS}.${ASSIGNMENT}.txt > .submission${CLASS}.${ASSIGNMENT}.temp
mv .submission${CLASS}.${ASSIGNMENT}.temp .submission${CLASS}.${ASSIGNMENT}.txt

for GROUP in `ls ~/${CLASS}.*.members.csv`
do
    GROUP_NUM=`echo "${GROUP}" | sed 's/\./_/g' | cut -d '_' -f2`
    cut -d ',' -f1 ${GROUP} > .group.${CLASS}.csv
    comm -23 .group.csv .submission${CLASS}.${ASSIGNMENT}.txt > .not.csv
    if [ ! -s .not.${CLASS}.csv ]
    then
	echo
	grep -e ^${GROUP_NUM}\, ~/${CLASS}.groups.csv | cut -d ',' -f2
	awk -F , '{ printf "%08d %s\n" , $2 , $3 }' ~/${CLASS}.${GROUP_NUM}.members.csv
    fi
done

rm .submission${CLASS}.${ASSIGNMENT}.txt .not.${CLASS}.csv .group.${CLASS}.csv
