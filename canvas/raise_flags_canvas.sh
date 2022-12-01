#!/bin/bash

clear;

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

for USER in `cat .submission${CLASS}.${ASSIGNMENT}.txt`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/users/${USER} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'my $user = $_; if( $user->{"sis_user_id"} ){ printf "%08d\t%s\n" , $user->{"sis_user_id"} , $user->{"name"}; }' 
done

rm .submission${CLASS}.${ASSIGNMENT}.txt
