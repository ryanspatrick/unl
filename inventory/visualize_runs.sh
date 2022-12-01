#!/bin/bash

for date in `date "+%Y%m%d"`
do
    ANR=`grep -e ANR-U$ /home/fac/rpatrick/public_html/inventory/${date}.log /home/fac/rpatrick/public_html/inventory/text/${date}.log | grep -c -e .`
    ARH=`grep -e ARH-U$ /home/fac/rpatrick/public_html/inventory/${date}.log /home/fac/rpatrick/public_html/inventory/text/${date}.log | grep -c -e .`
    ASC=`grep -e ASC-U$ /home/fac/rpatrick/public_html/inventory/${date}.log /home/fac/rpatrick/public_html/inventory/text/${date}.log | grep -c -e .`
    CBA=`grep -e CBA-U$ /home/fac/rpatrick/public_html/inventory/${date}.log /home/fac/rpatrick/public_html/inventory/text/${date}.log | grep -c -e .`
    EHS=`grep -e EHS-U$ /home/fac/rpatrick/public_html/inventory/${date}.log /home/fac/rpatrick/public_html/inventory/text/${date}.log | grep -c -e .`
    ENG=`grep -e ENG-U$ /home/fac/rpatrick/public_html/inventory/${date}.log /home/fac/rpatrick/public_html/inventory/text/${date}.log | grep -c -e .`
    FPA=`grep -e FPA-U$ /home/fac/rpatrick/public_html/inventory/${date}.log /home/fac/rpatrick/public_html/inventory/text/${date}.log | grep -c -e .`
    GEN=`grep -e GEN-U$ /home/fac/rpatrick/public_html/inventory/${date}.log /home/fac/rpatrick/public_html/inventory/text/${date}.log | grep -c -e .`
    JMC=`grep -e JMC-U$ /home/fac/rpatrick/public_html/inventory/${date}.log /home/fac/rpatrick/public_html/inventory/text/${date}.log | grep -c -e .`
    PAC=`grep -e PAC-U$ /home/fac/rpatrick/public_html/inventory/${date}.log /home/fac/rpatrick/public_html/inventory/text/${date}.log | grep -c -e .`
    echo "${date},${ANR},${ARH},${ASC},${CBA},${EHS},${ENG},${FPA},${GEN},${JMC},${PAC}" > /home/fac/rpatrick/public_html/inventory/runs.txt
done
cat /home/fac/rpatrick/public_html/inventory/programs.csv /home/fac/rpatrick/public_html/inventory/runs.txt > /home/fac/rpatrick/public_html/inventory/runs.csv
gnuplot /home/fac/rpatrick/public_html/inventory/visualizeRuns.plt
epstopdf /home/fac/rpatrick/public_html/inventory/runs1188.eps
rm ~rpatrick/public_html/inventory/runs.txt ~rpatrick/public_html/inventory/runs1188.eps ~rpatrick/public_html/inventory/runs.csv
