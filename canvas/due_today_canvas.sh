#!/bin/bash

CLASS=$1
KEY=$2
today=`/usr/bin/date +%Y-%m-%d`

numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d\n" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=1
fi
touch .assignments.${CLASS}.txt
for page in `seq 1 ${numPages}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'use Time::Piece; my $now = localtime; for my $assignment( @{$_} ){ my $t = Time::Piece->strptime( $assignment->{"due_at"} , "%Y-%m-%dT%H:%M:%SZ" ); $t = $t + $now->tzoffset; printf "%s,%d\n" , $t->strftime( "%Y-%m-%d" ) , $assignment->{"id"} ; }' >> .assignments.${CLASS}.txt
done

grep -e ^${today} .assignments.${CLASS}.txt > .due_${today}.${CLASS}.txt

sleep 70s

for as in `cut -d ',' -f2 .due_${today}.${CLASS}.txt`
do
    bash ~rpatrick/public_html/canvas/raise_flags_canvas.sh ${CLASS} ${as} ${KEY}
done

rm ~.due_${today}.${CLASS}.txt .assignments.${CLASS}.txt
