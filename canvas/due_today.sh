#!/bin/bash

CLASS=$1
KEY=$2
today=`/usr/bin/date +%Y-%m-%d`

curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/students -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none 'for my $student( @{$_} ){ printf "%08d %s\n" , $student->{"sis_user_id"} , $student->{ "name" }; }' | sort | uniq > ~/allInfo.txt

sed 's/^\([^ ]*\) .* \([0-9\-]*\) \([0-9:]*\)$/\1,\2/g' ~/homework | grep -e ${today} | awk -F , '{ printf "%s\n" , $1 }' > ~/due_${today}.txt

sleep 70s

for as in `cat ~/due_${today}.txt`
do
    bash ~/raise_flags.sh ~/allInfo.txt ${as} > ~/nothing${as}.txt
done

rm ~/due_${today}.txt
