#!/bin/bash

TERM=$1
KEY=$2
today=`/usr/bin/date +%Y,%m,%d`

numPages=`curl -sS https://canvas.unl.edu/api/v1/courses -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d\n" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=1
fi
for page in `seq 1 ${numPages}`
do
   curl -sS https://canvas.unl.edu/api/v1/courses?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $course( @{$_} ){ printf "%d,%s\n" , $course->{"id"} , $course->{"course_code"}; }' >> .courses.txt
done

for CLASS in `cat .courses.txt | grep -e \.${TERM}$ | cut -d ',' -f1`
do    
    numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d\n" , $14 }'`
    if [ ${numPages} -eq 0 ]
    then
	numPages=1
    fi
    touch .assignments.${CLASS}.txt
    for page in `seq 1 ${numPages}`
    do
	curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'use Time::Piece; my $now = localtime; for my $assignment( @{$_} ){ my $t = Time::Piece->strptime( $assignment->{"due_at"} , "%Y-%m-%dT%H:%M:%SZ" ); $t = $t + $now->tzoffset; printf "%s,%d,\n" , $t->strftime( "%Y,%m,%d,%H,%M" ) , $assignment->{"id"} ; }' >> .assignments.${CLASS}.txt
	sed "s/,$/,${CLASS}/g" .assignments.${CLASS}.txt > .assignments.${CLASS}.temp
	mv .assignments.${CLASS}.temp .assignments.${CLASS}.txt
    done
    
    grep -e ^${today} .assignments.${CLASS}.txt | awk -F , '{ printf "% 2d % 2d % 2d % 2d * bash ~rpatrick/public_html/canvas/raise_flags_canvas.sh %d %d ${CANVAS}\n" , $5 , $4 , $3 , $2 , $7 , $6 }'
    rm .assignments.${CLASS}.txt
done
rm .courses.txt
