CLASS=$1
ID=`basename $1 .groups.csv`
KEY=$2
for group in `cut -d ',' -f1 ${CLASS}`
do
    curl -sS -X GET -H "Authorization: Bearer ${KEY}" https://canvas.unl.edu/api/v1/groups/${group}/users | json_xs -f json -t none -e 'for my $mem( @{$_} ){ printf "%d,%08d,%s\n" , $mem->{"id"} , $mem->{"sis_user_id"} , $mem->{"name"}; }' | sort | uniq > `dirname ${CLASS}`/${ID}.${group}.members.csv
done
