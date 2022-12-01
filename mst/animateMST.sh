#!/bin/bash

DATE=`/usr/bin/date +%Y%m%d%H%M%S%N`
DATE=$1

./makeUndirectedGraph.out 1> ${DATE}.nodes.csv 2> ${DATE}.edge.csv

for e in `cut -d ';' -f3 ${DATE}.edge.csv | sort | uniq`
do
    echo ";;${e}" >> ${DATE}.edges.${e}.csv
    grep -e \;${e}$ ${DATE}.edge.csv >> ${DATE}.edges.${e}.csv
done

numNodes=`grep -c -e . ${DATE}.nodes.csv`
echo "${numNodes}" >> ${DATE}.dat
sed "s/;/ /g" ${DATE}.edge.csv >> ${DATE}.dat
echo > ${DATE}.mst.csv
./makeMST.out < ${DATE}.dat 1> ${DATE}.total 2>> ${DATE}.mst.csv
total=`cat ${DATE}.total`
numEdges=$[${numNodes}-1]
for line in `seq 1 ${numNodes}`
do
    mstName=`echo "${DATE},${line}" | awk -F , '{ printf "%s.mst.%c.dat" , $1 , $2 + 64 }'`
    head -n ${line} ${DATE}.mst.csv > ${mstName}
done

sed "s/DATE/${DATE}/g;s/NODES/${numNodes}/g;s/MST/MST Value: ${total}/g" template.plt > ${DATE}.plt
gnuplot ${DATE}.plt &> /dev/null
sed "s/DATE/${DATE}/g;s/NODES/${numNodes}/g;s/MST/MST Value: ${total}/g" templatePDF.plt > ${DATE}.plt
gnuplot ${DATE}.plt &> /dev/null
epstopdf ${DATE}.eps &> /dev/null
chmod a+r ${DATE}.gif
chmod a+r ${DATE}.nodes.csv ${DATE}.edge.csv ${DATE}.pdf
rm `ls ${DATE}* | grep -v -e gif$ -e ${DATE}.nodes.csv -e ${DATE}.edge.csv -e ${DATE}.pdf`
