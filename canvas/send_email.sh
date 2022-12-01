#!/bin/bash

CLASS=$1 # Canvas Class Number
USERS=$2
SUBJECT=$3
BODY=$4
KEY=$5 # Canvas Key

#bash ~rpatrick/public_html/canvas/get_nuids_usernames_canvas.sh ${CLASS} ${KEY}
bash ~rpatrick/public_html/canvas/get_nuids_usernames_canvas.sh ${CLASS} ${KEY} | cut -d ',' -f1,3 > .${CLASS}.user_canvas.csv

for user in `cat ${USERS}`
do
    ID=`grep -e ^${user}[^a-z] .${CLASS}.user_canvas.csv | cut -d ',' -f2`
    subject=`cat ${SUBJECT}`
    body=`cat ${BODY}`
    curl -sS -X POST -H "Authorization: Bearer ${KEY}" -F "recipients[]=${ID}" -F "subject=${subject}" -F "body=${body}" https://canvas.unl.edu/api/v1/conversations
done

rm .${CLASS}.user_canvas.csv
