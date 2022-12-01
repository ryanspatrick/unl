#!/bin/bash
CLASS=$1
KEY=$2

for student in `curl -sS -X GET https://canvas.unl.edu/api/v1/courses/${CLASS}/students -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ printf "%08d,%s\n" , $student->{"sis_user_id"} , $student->{"login_id"} }' | grep -v -e ^0*\, | cut -d ',' -f2`
do
    curl -sS -X GET https://directory.unl.edu/people/${student}.json | json_xs -f json -t none -e 'printf "%s\n" , $_->{"unlSISClassLevel"}'
    sleep 0.5
done
