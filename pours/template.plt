set terminal gif enhanced linewidth 1 giant font "Courier,24" crop animate delay 100 loop 0 background "#FFFFFF" size 1920,1080

set key top center outside
set datafile sep ','
set output "DATE.gif"
set style histogram rowstacked
set style fill solid border -1
set boxwidth 0.8
pours = system( 'ls DATE*.pour*.dat' )
unset title
#set title "Target: TARGET Gallon(s)"
set xtics ( "1" 0 , "2" 1 , "3" 2 ) scale 0,0
set xlabel "Jug"
set ylabel "Gallons"
set yrange [0:LIMIT]
set ytics 0,1,MAX

f(x) = TARGET

do for [pour in pours]{
   plot pour using 4 with histogram lc rgb "gray" notitle,\
   	pour using 9 with histogram lc rgb "white" notitle,\
	f(x) with lines lc rgb "black" lt 2 	   title "Target (TARGET Gallons)"
}
