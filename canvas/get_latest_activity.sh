CLASS=$1
KEY=$2

curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/students -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ printf "%d,%08d,%s\n" , $student->{"id"} , $student->{"sis_user_id"} , $student->{"name"}; }' | sort | uniq > students.ids.${CLASS}

for id in `cut -d ',' -f1 students.ids.${CLASS}`
do
    lastDay=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/analytics/users/${id}/activity -H "Authorization: Bearer ${CANVAS}" -X GET | json_xs -f json -t json-pretty | grep -e \"\ :\ [0-9] | sort | tail -n 1 | sed 's/^[^"]*"\([^"]*\)".*$/\1/g'`
    nuid=`grep -e ^${id}\, students.ids.${CLASS} | cut -d ',' -f2`
    name=`grep -e ^${id}\, students.ids.${CLASS} | cut -d ',' -f3`
    echo "${lastDay},${id},${nuid},${name}" | awk -F , '{ printf "% 25s %08d %-10d %s\n" , $1 , $3 , $2 , $4 }' >> info.${CLASS}
done
sort -nr info.${CLASS} > info.${CLASS}.temp
mv info.${CLASS}.temp info.${CLASS}
cat info.${CLASS}
/usr/bin/date +"%Y-%m-%d %H:%M:%S"
rm students.ids.${CLASS} info.${CLASS}
