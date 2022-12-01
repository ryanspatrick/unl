set terminal postscript enhanced monochrome linewidth 1 "Courier,12" eps
set key inside left top
set datafile sep ','
set output "/home/fac/rpatrick/public_html/inventory/runs1188.eps"
set ylabel "NSE Advising Inventory Visualizer Runs"
set xlabel "Date"
unset xtics
set xtics rotate by -45 scale 0
set grid y
set auto x
set style data histogram
set style histogram rowstacked
set boxwidth 0.5
set style fill pattern border -1
set key autotitle columnhead

plot '/home/fac/rpatrick/public_html/inventory/runs.csv' using 2:xtic(strftime('%m/%d',strptime('%Y%m%d',strcol(1)))), for [i=3:11] '' using i
