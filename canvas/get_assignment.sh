CLASS=$1
ASSIGNMENT=$2
KEY=$3
# curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments/${ASSIGNMENT} -I -X GET -H "Authorization: Bearer ${KEY}"
numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments/${ASSIGNMENT}/submissions -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d\n" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=1
fi
curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments/${ASSIGNMENT} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'printf "%s\n" , $_->{"name"}'
for pg in `seq 1 ${numPages}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/assignments/${ASSIGNMENT}/submissions?page=${pg} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $submission( @{$_} ){ printf "%f,%d\n" , $submission->{"score"} , $submission->{"user_id"} ; }'
done
