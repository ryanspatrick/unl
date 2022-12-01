#!/bin/bash

CLASS=$1 # Canvas Class Number
KEY=$2 # Canvas Key

c=${CLASS}

curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/students -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ printf "%08d\n" , $student->{"sis_user_id"} ; }' | sort | uniq | php ~rpatrick/public_html/canvas/get_nuids_usernames.php 1> `pwd`/${c}_usernames_nuids.csv 2> `pwd`/${c}.err

curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/students -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ printf "%08d,%d\n" , $student->{"sis_user_id"} , $student->{"id"} ; }' | sort | uniq 1> `pwd`/${c}_nuids_canvas.csv 2> `pwd`/${c}.err

for nuid in `cut -d ',' -f2 ${c}_usernames_nuids.csv | grep -e [0-9]`
do
    user=`grep -e \,${nuid}$ ${c}_usernames_nuids.csv | cut -d ',' -f1`
    canvas=`grep -e ^${nuid}\, ${c}_nuids_canvas.csv | cut -d ',' -f2`
    echo "${user},${nuid},${canvas}" | grep -v -e \,$
done

rm `pwd`/${c}_usernames_nuids.csv `pwd`/${c}_nuids_canvas.csv `pwd`/${c}.err
