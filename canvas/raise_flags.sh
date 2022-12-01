#!/bin/bash

INFO=$1
ASSIGNMENT=$2

cut -d ' ' -f1 ~/mail.list | sort > ~/.usernames.txt
cut -d ' ' -f1 ~/handin/${ASSIGNMENT}/record > ~/.usernames${ASSIGNMENT}.txt
ls ~/handin/${ASSIGNMENT} | grep ^[a-z]*$ | grep -v -e ^record$ >> ~/.usernames${ASSIGNMENT}.txt
sort ~/.usernames${ASSIGNMENT}.txt | uniq > ~/.usernames${ASSIGNMENT}.temp
mv ~/.usernames${ASSIGNMENT}.temp ~/.usernames${ASSIGNMENT}.txt

grep -v -f ~/.usernames${ASSIGNMENT}.txt ~/.usernames.txt > ~/.usernames${ASSIGNMENT}Nothing.txt
grep -f ~/.usernames${ASSIGNMENT}Nothing.txt ~/usernames_nuids_canvas.csv | cut -d ',' -f2 > ~/.patterns${ASSIGNMENT}Nothing.txt
cp ${INFO} ~/.info${ASSIGNMENT}.txt
grep -f ~/.patterns${ASSIGNMENT}Nothing.txt ~/.info${ASSIGNMENT}.txt > ~/.info${ASSIGNMENT}Nothing.txt
cat ~/.info${ASSIGNMENT}Nothing.txt

rm ~/.usernames.txt ~/.*${ASSIGNMENT}*.txt
