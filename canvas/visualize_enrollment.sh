#!/bin/bash

CLASS=$1
KEY=$2

curl -sS -X GET https://canvas.unl.edu/api/v1/courses/${CLASS}/students -H "Authorization: Bearer ${KEY}" | json_xs -f json -t none -e 'for my $student( @{$_} ){ printf "%s\n" , $student->{"login_id"} }' 1> ${CLASS}.ids 2> /dev/null

for student in `cat ${CLASS}.ids`
do
    curl -sS https://directory.unl.edu/people/${student}.json | json_xs -f json -t none -e 'printf "%s;" , $_->{"unlSISClassLevel"}; for my $college( @{$_->{"unlSISCollege"}} ){ printf "%s," , $college }; printf ";"; for my $major( @{$_->{"unlSISMajor"}} ){ printf "%s," , $major }; printf ";%s\n" , $_->{"displayName"}[0];' 1>> ${CLASS}.info 2> /dev/null
    touch ${CLASS}.info
done

cut -d ';' -f1 ${CLASS}.info | grep -e [a-zA-Z] > ${CLASS}.year
touch ${CLASS}.major.cs
cs=`cut -d ';' -f3 ${CLASS}.info | grep -c -e Computer.Science`
for major in `seq 1 ${cs}`
do
    echo "Computer Science" >> ${CLASS}.major.cs
done
touch ${CLASS}.major.ce
ce=`cut -d ';' -f3 ${CLASS}.info | grep -c -e Computer.Engineering`
for major in `seq 1 ${ce}`
do
    echo "Computer Engineering" >> ${CLASS}.major.ce
done
touch ${CLASS}.major.se
se=`cut -d ';' -f3 ${CLASS}.info | grep -c -e Software.Engineering`
for major in `seq 1 ${se}`
do
    echo "Software Engineering" >> ${CLASS}.major.se
done
grep -v -e Computer.Science -e Computer.Engineering -e Software.Engineering ${CLASS}.info | grep -e [a-zA-Z] | cut -d ';' -f3 | sed 's/,$//g' > ${CLASS}.major.other

touch ${CLASS}.college.asc
for college in `cut -d ';' -f2 ${CLASS}.info | grep -e ASC-U`
do
    echo "ASC-U" >> ${CLASS}.college.asc
done
touch ${CLASS}.college.eng
for major in `cut -d ';' -f2 ${CLASS}.info | grep -e ENG-U`
do
    echo "ENG-U" >> ${CLASS}.college.eng
done
grep -v -e ASC-U -e ENG-U ${CLASS}.info | grep -e [a-zA-Z] | cut -d ';' -f2 | sed 's/,$//g' > ${CLASS}.college.other

for year in `sort ${CLASS}.year | uniq`
do
    count=`grep -c -e ^${year}$ ${CLASS}.year`
    echo "${year}:${count}" >> ${CLASS}.count.year.temp
done
total=`cut -d ':' -f2 ${CLASS}.count.year.temp | awk '{ total += $0; $0 = total; print total }' | tail -n 1`
awk -F : '{ total += $2; printf "%s:%d:%d:TOTAL\n" , $1 , $2 , total }' ${CLASS}.count.year.temp | sed "s@TOTAL@${total}@g" > ${CLASS}.count.year

lines=`grep -c -e . ${CLASS}.count.year`
for line in `seq 1 ${lines}`
do
    filename=`echo "${line}" | awk -F , '{ printf "CLASS.count.year.%c.dat" , $1 + 64 }' | sed "s@CLASS@${CLASS}@g"`
    head -n ${line} ${CLASS}.count.year | tail -n 1 | awk -F : '{ printf "%06.2f%% %s\n" , $2 / $4 * 100 , $1 }' > ${filename}
    head -n ${line} ${CLASS}.count.year | tail -n 1 >> ${filename}
done

$OLD_IFS=${IFS} &> /dev/null
IFS=$'\t\n'
for major in `sort ${CLASS}.major.other | uniq`
do
    count=`grep -c -e ^${major}$ ${CLASS}.major.other`
    echo "${major}:${count}" >> ${CLASS}.count.major.temp
done
count=`grep -c -e . ${CLASS}.major.ce`
echo "Computer Engineering:${count}" >> ${CLASS}.count.major.temp
count=`grep -c -e . ${CLASS}.major.cs`
echo "Computer Science:${count}" >> ${CLASS}.count.major.temp
count=`grep -c -e . ${CLASS}.major.se`
echo "Software Engineering:${count}" >> ${CLASS}.count.major.temp
total=`cut -d ':' -f2 ${CLASS}.count.major.temp | awk '{ total += $0; $0 = total; print total }' | tail -n 1`
awk -F : '{ total += $2; printf "%s:%d:%d:TOTAL\n" , $1 , $2 , total }' ${CLASS}.count.major.temp | sed "s@TOTAL@${total}@g" > ${CLASS}.count.major

lines=`grep -c -e . ${CLASS}.count.major`
for line in `seq 1 ${lines}`
do
    filename=`echo "${line}" | awk -F , '{ printf "CLASS.count.major.%c.dat" , $1 + 64 }' | sed "s@CLASS@${CLASS}@g"`
    head -n ${line} ${CLASS}.count.major | tail -n 1 | awk -F : '{ printf "%06.2f%% %s\n" , $2 / $4 * 100 , $1 }' > ${filename}
    head -n ${line} ${CLASS}.count.major | tail -n 1 >> ${filename}
done

for college in `sort ${CLASS}.college.other | uniq`
do
    count=`grep -c -e ^${college}$ ${CLASS}.college.other`
    echo "${college}:${count}" >> ${CLASS}.count.college.temp
done
count=`grep -c -e . ${CLASS}.college.eng`
echo "ENG-U:${count}" >> ${CLASS}.count.college.temp
count=`grep -c -e . ${CLASS}.college.asc`
echo "ASC-U:${count}" >> ${CLASS}.count.college.temp
total=`cut -d ':' -f2 ${CLASS}.count.college.temp | awk '{ total += $0; $0 = total; print total }' | tail -n 1`
awk -F : '{ total += $2; printf "%s:%d:%d:TOTAL\n" , $1 , $2 , total }' ${CLASS}.count.college.temp | sed "s@TOTAL@${total}@g" > ${CLASS}.count.college

lines=`grep -c -e . ${CLASS}.count.college`
for line in `seq 1 ${lines}`
do
    filename=`echo "${line}" | awk -F , '{ printf "CLASS.count.college.%c.dat" , $1 + 64 }' | sed "s@CLASS@${CLASS}@g"`
    head -n ${line} ${CLASS}.count.college | tail -n 1 | awk -F : '{ printf "%06.2f%% %s\n" , $2 / $4 * 100 , $1 }' > ${filename}
    head -n ${line} ${CLASS}.count.college | tail -n 1 >> ${filename}
done

for ELEMENT in year major college
do
    sed "s@CLASS@${CLASS}@g;s@ELEMENT@${ELEMENT}@g" ~rpatrick/public_html/canvas/template_enrollment.plt > ${CLASS}.${ELEMENT}.plt
    gnuplot ${CLASS}.${ELEMENT}.plt 2> /dev/null
    epstopdf ${CLASS}.${ELEMENT}.eps 2> /dev/null
    rm ${CLASS}.${ELEMENT}.plt ${CLASS}.${ELEMENT}.eps
done

rm ${CLASS}.ids ${CLASS}.info ${CLASS}.year ${CLASS}.major.cs ${CLASS}.major.ce ${CLASS}.major.se ${CLASS}.major.other ${CLASS}.college.asc ${CLASS}.college.eng ${CLASS}.college.other ${CLASS}.count.year ${CLASS}.count.year.temp ${CLASS}.count.year.*.dat ${CLASS}.count.major ${CLASS}.count.major.temp ${CLASS}.count.major.*.dat ${CLASS}.count.college ${CLASS}.count.college.temp ${CLASS}.count.college.*.dat
IFS=${OLD_IFS}
