CLASS=$1
KEY=$2
numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/enrollments -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=30
fi
for page in `seq 1 ${numPages}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/enrollments?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ if( $student->{"type"} ne "TeacherEnrollment" ){ next; } printf "%d\n" , $student->{"user"}->{"id"} }' >> ${CLASS}.instructors.ids.csv
done

numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/users -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d\n" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=30
fi

for page in `seq 1 ${numPages}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/users?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ printf "%d,%s,\n" , $student->{"id"} , $student->{"email"} ; }' >> ${CLASS}.emails.csv
done

grep -f ${CLASS}.instructors.ids.csv ${CLASS}.emails.csv | sed 's/^[^,]*,//g'

rm ${CLASS}.instructors.ids.csv ${CLASS}.emails.csv
