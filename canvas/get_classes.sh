KEY=$1
echo
echo "Classes"
numPages=`curl -sS https://canvas.unl.edu/api/v1/courses -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d\n" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=1
fi
for page in `seq 1 ${numPages}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $class( @{$_} ){ printf "% 8d\t%s\n" , $class->{"id"} , $class->{"course_code"} ; }'
done
echo
