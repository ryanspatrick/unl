FILE=$1
CLASS=$2
DESTINATION=$3
KEY=$4
SIZE=`ls -l ${FILE} | cut -d ' ' -f5`
NAME=`basename ${FILE}`
TYPE=`file -i ${FILE} | cut -d ' ' -f2 | sed 's/;//g'`

URL=`curl -sS https://canvas.unl.edu/api/v1/courses/${CLASS}/files -X POST -F "name=${NAME}" -F "parent_folder_path=${DESTINATION}" -F "size=${SIZE}" -F "content_type=${TYPE}" -F "locked=true" -F "hidden=true" -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'printf "%s" , $_->{"upload_url"};'`
LOCATION=`curl -sS -X POST -F "name=${NAME}" -F "size=${SIZE}" -F "content_type=${TYPE}" -F "parent_folder_path=${DESTINATION}" -F "file=@${FILE}" -H "Authorization: Bearer ${KEY}" ${URL} | json_xs -f json -t none -e 'printf "%s" , $_->{"location"};'`
curl -sS -X POST -H "Content-Length: 0" -H "Authorization: Bearer ${KEY}" ${LOCATION} | json_xs -f json -t none -e 'printf "The file can be accessed at %s\n" , $_->{"url"};'
