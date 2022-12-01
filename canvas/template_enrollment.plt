set terminal postscript enhanced linewidth 1 "Courier,24" eps

set output "CLASS.ELEMENT.eps"
set datafile sep ":"
set size square
unset xtics
unset ytics
unset border
set key top center outside Left
#set title "ELEMENT"
set style fill pattern border 1

files=system( 'ls CLASS.count.ELEMENT.*.dat' )

mymod(v) = (v > 360)?(v - 360):(v)
start(cou,cum,tot) = mymod( 450.0 - 360.0 * cum / tot )
end(cou,cum,tot) = mymod( 450.0 - 360.0 * ( cum - cou ) / tot )

plot for [f in files] f using (0):(0):(1):(start($2,$3,$4)):(end($2,$3,$4)) with circles lw 0.1 title columnhead(1)