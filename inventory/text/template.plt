unset xtics
unset ytics
unset border
#set title "DATE"
set terminal postscript eps enhanced monochrome "Courier,12"
set datafile sep ','
set size square
set yrange [-8:8]
set xrange [-8:8]
set style line 1 linewidth 5 pt 7 ps 2
set style line 2 linewidth 1
set key outside center top
set output "/home/fac/rpatrick/public_html/inventory/text/DATE.ps"
plot \
     '/home/fac/rpatrick/public_html/inventory/text/boundaries.dat' using 1:2 with lines linetype 3 notitle, \
     '/home/fac/rpatrick/public_html/inventory/text/international.dat' using ($2*1.2):($3*1.2) with circles fill solid 0.2 noborder title 'International Student Success Seminar Questions', \
     '/home/fac/rpatrick/public_html/inventory/text/inverse.dat' using ($2*1.2)\
:($3*1.2) with circles ls 2 title 'Negatively-Worded Questions', \
     '/home/fac/rpatrick/public_html/inventory/text/ideal.dat' using ($2*1.2):($3*\
1.2):1 with labels notitle, \
     '/home/fac/rpatrick/public_html/inventory/text/slices.dat' using ($1*1.125):($2*1.125) with lines linestyle 2 notitle, \
     '/home/fac/rpatrick/public_html/inventory/text/groups.dat' using ($2*1.55):($3*1.55):1 with labels notitle, \
     '/home/fac/rpatrick/public_html/inventory/text/ideal.dat' using 2:3 with lines linestyle 2 notitle , \
     '/home/fac/rpatrick/public_html/inventory/text/ideal.dat' using ($2*0.8):($3*0.8) with lines linestyle 2 notitle , \
     '/home/fac/rpatrick/public_html/inventory/text/ideal.dat' using ($2*0.6):($3*0.6) with lines linestyle 2 notitle , \
     '/home/fac/rpatrick/public_html/inventory/text/ideal.dat' using ($2*0.4):($3*0.4) with lines linestyle 2 notitle , \
     '/home/fac/rpatrick/public_html/inventory/text/ideal.dat' using ($2*0.2):($3*0.2) with lines linestyle 2 notitle , \
     '/home/fac/rpatrick/public_html/inventory/text/DATE.dat' with linespoints linestyle 1 notitle
unset key
