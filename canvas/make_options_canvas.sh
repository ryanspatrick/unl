#!/bin/bash

CLASS=$1 # Canvas Class Number
KEY=$2 # Canvas Key

curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/students -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ printf "%s,%d\n" , $student->{"name"} , $student->{"id"}; }' | sort | uniq | awk -F , '{ printf "<option label=\"%s\" value=\"%d\">%s</option>\n" , $1 , $2 , $1 }'
