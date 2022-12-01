#!/bin/bash

for c in `seq 1 130`
do
    class=`head -n ${c} ~rpatrick/public_html/cse_ta/courses_only.txt | tail -n 1`
    cut -d , -f 1,2,3,$[3+${c}] ~rpatrick/public_html/cse_ta/responses.csv | grep -v -e \"N\"$ | cut -d , -f 1,2,3 | sort | uniq > ${class}.txt
    lines=`grep -c -e . ${class}.txt`
    if [ ${lines} -lt 1 ]
    then
	rm ${class}.txt
    fi
done
