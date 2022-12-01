CLASS=$1
KEY=$2
numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/enrollments -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^[lL]ink | sed 's/&/=/g' | awk -F = '{ printf "%d" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=1
fi
for page in `seq 1 ${numPages}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/enrollments?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ if( $student->{"type"} ne "StudentEnrollment" ){ next; } printf "% 7.2f %08d %s\n" , $student->{"grades"}->{"unposted_current_score"} , $student->{"sis_user_id"} , $student->{"user"}->{"name"} }'
done
