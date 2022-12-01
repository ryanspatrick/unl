#!/bin/bash

CLASS=$1 # Canvas Class Number
KEY=$2 # Canvas Key

numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/users -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d\n" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=30
fi
for page in `seq 1 ${numPages}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/users?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ printf "%s <%s>,\n" , $student->{"name"} , $student->{"email"} ; }'
done
