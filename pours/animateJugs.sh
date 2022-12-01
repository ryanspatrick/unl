#!/bin/bash

DATE=`/usr/bin/date +%Y%m%d%H%M%S%N`
DATE=$1
C=$[${RANDOM} % 5 + 2]
B=$[ ${C} + $[${RANDOM} % 5 + 2]]

while [ `echo "${B}" "${C}" | ./myGCD.out` -gt 1 ]
do
    C=$[${RANDOM} % 5 + 2]
    B=$[ ${C} + $[${RANDOM} % 5 + 2]]
done
A=$[${B} + ${C}]
T=$[${RANDOM} % $[${A}-1] + 1]
pl -q -f minPours.pl -t "halt" -g "minPours((${A},${B},${C}),${T},Pours),printPours(Pours,(${A},${B},${C})),halt" 1> ${DATE}.dat 2> /dev/null

numPours=`grep -c -e \# ${DATE}.dat`
grep -n -e \# ${DATE}.dat > ${DATE}.temp
grep -n -e . ${DATE}.temp > ${DATE}.files

for pourNum in `cut -d ':' -f1 ${DATE}.files`
do
    pourStart=`grep -e ^${pourNum}: ${DATE}.files | cut -d ':' -f2`
    head -n $[${pourStart}+3] ${DATE}.dat | tail -n 3 > `echo "${DATE},${pourNum}" | awk -F , '{ printf "%s.pour%02d.dat" , $1 , $2 }'`    
done

sed "s/DATE/${DATE}/g;s/TARGET/${T}/g;s/MAX/${A}/g;s/LIMIT/$[${A}+1]/g" template.plt > ${DATE}.plt
gnuplot ${DATE}.plt &> /dev/null
chmod a+r ${DATE}.gif
echo "<object type=\"image/gif\" data=\"" . ${DATE} . ".gif\"></object>"
rm `ls ${DATE}* | grep -v -e gif$`
