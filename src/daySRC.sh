#!/bin/bash

awk -F , '{ printf "%s,%s,%s,in\n" , $2 , $1 , $3 }' ~/public_html/src/in.csv >> ~/public_html/src/all.csv
awk -F , '{ printf "%s,%s,%s,out\n" , $2 , $1 , $3 }' ~/public_html/src/out.csv >> ~/public_html/src/all.csv
sort ~/public_html/src/all.csv | grep -e . > ~/public_html/src/all.sorted;
mv ~/public_html/src/all.sorted ~/public_html/src/all.csv
rm ~/public_html/src/in.csv ~/public_html/src/out.csv
touch ~/public_html/src/in.csv
touch ~/public_html/src/out.csv
