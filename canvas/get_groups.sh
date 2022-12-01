CLASS=$1
KEY=$2
numPages=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/groups -I -X GET -H "Authorization: Bearer ${KEY}" | grep -e ^link | sed 's/&/=/g' | awk -F = '{ printf "%d\n" , $14 }'`
if [ ${numPages} -eq 0 ]
then
    numPages=1
fi
for page in `seq 1 ${numPages}`
do
    curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/groups?page=${page} -X GET -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $group( @{$_} ){ printf "%d,%s\n" , $group->{"id"} , $group->{"name"} ; }' >> ~/${CLASS}.groups.csv
done
sort ~/${CLASS}.groups.csv | uniq > ~/${CLASS}.groups.temp
mv ~/${CLASS}.groups.temp ~/${CLASS}.groups.csv
