#!/bin/bash

cut -d ',' -f1 in.csv > in.sorted.csv
cut -d ',' -f1 out.csv > out.sorted.csv
comm -23 in.sorted.csv out.sorted.csv > in.current.csv
for user in `cat in.current.csv`
do
    grep -e ^${user}[^a-z] classes.csv | cut -d ',' -f2 >> current.csv
    grep -e \"${user}\" index.html | cut -d '"' -f2 >> currentNames.csv
done

sort current.csv | uniq > current.txt
sort currentNames.csv | uniq > currentNames.txt
chmod a+r current.txt currentNames.txt

rm in.sorted.csv out.sorted.csv in.current.csv current.csv currentNames.csv
