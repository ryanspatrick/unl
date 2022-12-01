#!/bin/bash

SECTIONS=$1 # a file of Canvas course IDs (one per line)
KEY=$2

export CLASSPATH="/home/fac/rpatrick/public_html/canvas/java/antlr-4.5.3-complete.jar:/home/fac/rpatrick/public_html/canvas/java"

for SECTION in `cat ${SECTIONS}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${SECTION}/students -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ printf "%s\n" , $student->{"name"} ; }' | sort | uniq > ${SECTION}.students
    grep -v -e Test.Student ${SECTION}.students > ${SECTION}.students.temp
    mv ${SECTION}.students.temp ${SECTION}.students
    sec=`curl -sS https://canvas.unl.edu/api/v1/courses/${SECTION} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'printf "%s\n" , $_->{"course_code"} ;'`
    echo "${sec}"
    echo "-------------"
    shuf ${SECTION}.students | java org.antlr.v4.gui.TestRig partners file
    echo "-------------"
    rm ${SECTION}.students
done
