set terminal svg size 1920,1080 dynamic enhanced font "Courier,18" linewidth 1
set key inside left top
set datafile sep ','
set output "/home/fac/rpatrick/public_html/moss/DATE.svg"
set xrange [0:125]
set yrange [0:100]
set xtics 0,10,100
set ytics 0,10,100
set mxtics 10
set mytics 10
set grid xtics ytics lt -1 lw 0.01
set grid back
set xlabel "Percentage of Student A Code"
set ylabel "Percentage of Student B Code"

plot '/home/fac/rpatrick/public_html/moss/DATE.csv' using 2:4 pt -6 notitle,\
     '' using 2:4:(sprintf("%s\n%s\n(%d)",stringcolumn(1),stringcolumn(3),$5)) with labels center offset 0,-1 font "Courier Bold,12" notitle
     