CLASS=$1
KEY=$2
echo
echo "Students"
echo "NUID,Name" | awk -F , '{ printf "%-8s %s\n" , $1 , $2 }'
curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/students -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ printf "%08d %s\n" , $student->{"sis_user_id"} , $student->{"name"} ; }' | sort | uniq
echo
echo "Assignments"
numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d\n" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=1
fi
echo "Due Date/Time,Canvas ID,Assignment" | awk -F , '{ printf "%-19s %-11s %s\n" , $1 , $2 , $3 }'
for page in `seq 1 ${numPages}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'use Time::Piece; my $now = localtime; for my $assignment( @{$_} ){ my $t = Time::Piece->strptime( $assignment->{"due_at"} , "%Y-%m-%dT%H:%M:%SZ" ); $t = $t + $now->tzoffset; printf "%-19s %-11d %s\n" , $t->strftime( "%Y-%m-%d %H:%M:%S" ) , $assignment->{"id"} , $assignment->{"name"} ; }'
done
echo
