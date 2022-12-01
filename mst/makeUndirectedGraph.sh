#!/bin/bash

filename=$1
./makeUndirectedGraph.out 1> ${filename}.nodes.csv 2> ${filename}.edge.csv
cp ${filename}.nodes.csv ${filename}Undirected.nodes.csv
cp ${filename}.edge.csv ${filename}Undirected.edges.csv

for e in `cut -d ';' -f3 ${filename}.edge.csv | sort | uniq`
do
    echo ";;${e}" >> ${filename}.edges.${e}.csv
    grep -e \;${e}$ ${filename}.edge.csv >> ${filename}.edges.${e}.csv
done

nodes=`grep -c -e . ${filename}.nodes.csv`
sed "s/FILE/${filename}/g;s/NODES/${nodes}/g" undirectedTemplatePDF.plt > ${filename}.plt
gnuplot ${filename}.plt
epstopdf ${filename}.eps
mv ${filename}.pdf ${filename}Undirected.pdf
sed "s/FILE/${filename}/g;s/NODES/${nodes}/g" undirectedTemplateSVG.plt > ${filename}.plt
gnuplot ${filename}.plt
cp ${filename}.svg ${filename}Undirected.svg
chmod a+r ${filename}*
rm `ls ${filename}.* | grep -v -e pdf$ -e svg$ -e Undirected.nodes.csv$ -e Undirected.edges.csv$`
