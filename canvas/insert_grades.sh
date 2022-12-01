#!/bin/bash
USERNAMES_IDS=$1 # CSV file in cse_username,nuid,canvas_id form
USERNAMES_SCORES=$2 # CSV file in cse_username,score form
CLASS=$3 # Canvas class number
ASSIGNMENT=$4 # Canvas assignment number
KEY=$5 # Canvas key

for line in `cat ${USERNAMES_IDS}`
do 
    user=`echo "${line}" | cut -d ',' -f1`
    canvas=`echo "${line}" | cut -d ',' -f3`
    nuid=`echo ${line} | cut -d ',' -f2`
    grade=`grep -e ^${user}[^a-z] ${USERNAMES_SCORES} | cut -d ',' -f2`
    echo "${user},${grade}" | awk -F , '{ printf "% 8.3f %s\n" , $2 , $1 }'
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments/${ASSIGNMENT}/submissions/update_grades -X POST -H "Authorization: Bearer ${KEY}" -F "grade_data[${canvas}][posted_grade]=${grade}" | json_xs -f json -t none
done
