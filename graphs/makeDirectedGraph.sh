#!/bin/bash

filename=$1
./makeDirectedGraph.out 1> ${filename}.nodes.csv 2> ${filename}.edge.csv
cp ${filename}.nodes.csv ${filename}Directed.nodes.csv
cp ${filename}.edge.csv ${filename}Directed.edges.csv
for e in `cut -d ';' -f3 ${filename}.edge.csv | sort | uniq`
do
    echo ";;${e}" >> ${filename}.edges.${e}.csv
    grep -e \;${e}$ ${filename}.edge.csv >> ${filename}.edges.${e}.csv
done
#cat ${filename}.nodes.csv ${filename}.edge.csv
nodes=`grep -c -e . ${filename}.nodes.csv`
sed "s/FILE/${filename}/g;s/NODES/${nodes}/g" directedTemplatePDF.plt > ${filename}.plt
gnuplot ${filename}.plt
epstopdf ${filename}.eps
mv ${filename}.pdf ${filename}Directed.pdf
sed "s/FILE/${filename}/g;s/NODES/${nodes}/g" directedTemplateSVG.plt > ${filename}.plt
gnuplot ${filename}.plt
cp ${filename}.svg ${filename}Directed.svg
chmod a+r ${filename}*
rm `ls ${filename}.* | grep -v -e pdf$ -e svg$ -e Directed.*.csv$`
