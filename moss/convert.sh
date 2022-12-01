#!/bin/bash

file=$1
d=`dirname ${file}`
b=`basename ${file} .html`

grep -e \% -e right\>[0-9]*$ ${file} | sed 's@^.*<TD><A HREF=[^>]*>\([^ ]*\)[^(]*.\([^%]*\).*@\1,\2@g;s/<TD ALIGN=right>//g' > ${file}.temp
export CLASSPATH="${d}/java/antlr-4.5.3-complete.jar:${d}/java"
java -Xmx2048m org.antlr.v4.gui.TestRig MOSS file ${file}.temp 1> ${d}/${b}.csv 2> ${d}/${b}.err
sed "s/DATE/${b}/g" ${d}/templatePDF.plt > ${d}/${b}.plt
gnuplot ${d}/${b}.plt
epstopdf --outfile=${d}/${b}.pdf ${d}/${b}.eps
chmod a+r ${d}/${b}.pdf
sed "s/DATE/${b}/g" ${d}/template.plt > ${d}/${b}.plt
gnuplot ${d}/${b}.plt
chmod a+r ${d}/${b}.svg
rm `ls ${d}/${b}*.* | grep -v -e pdf$ -e svg$`
