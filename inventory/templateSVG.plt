set terminal svg size 1920,1080 dynamic enhanced font "Courier,18" linewidth 1
set datafile sep ','
set size square
set yrange [-8:8]
set xrange [-8:8]
unset border
unset xtics
unset ytics

#set key outside center top
set key top center horizontal outside
set output "FILE.svg"
#set style fill pattern

mymod(v,m) = ( v >= m )?(v - m):v
xCoord(v,r) = r * cos( mymod( 5 * pi / 2 - v / 34.0 * 2 * pi , 2 * pi ) )
yCoord(v,r) = r * sin( mymod( 5 * pi / 2 - v / 34.0 * 2 * pi , 2 * pi ) )
deg(v) = mymod(450-v*360/34.0,360)
half = 360 / 34.0 * 0.5
rgb(r,g,b) = r * 2 ** 16 + g * 2 ** 8 + b * 2 ** 0

plot 'FILE.dat' using (0):(0):(5.5):(deg(8)-half):(deg(0)+half) with circles lw 5 dt 2 fs transparent pattern 0.2 border lc "black" notitle,\
     '' using (xCoord(4,7.5)):(yCoord(4,7.5)):(sprintf("Concerns")) with labels notitle,\
     '' using (0):(0):(5.5):(deg(16)-half):(deg(9)+half) with circles lw 5 dt 3 fs transparent solid 0.2 border lc "black" notitle,\
     '' using (xCoord(12.5,7.5)):(yCoord(12.5,7.5)):(sprintf("Perseverance")) with labels notitle,\
     '' using (0):(0):(5.5):(deg(21)-half):(deg(17)+half) with circles lw 5 dt 4 fs transparent solid 0.2 border lc "black" notitle,\
     '' using (xCoord(19,7.5)):(yCoord(19,7.5)):(sprintf("Motivation")) with labels notitle,\
     '' using (0):(0):(5.5):(deg(27)-half):(deg(22)+half) with circles lw 5 dt 5 fs transparent solid 0.2 border lc "black" notitle,\
     '' using (xCoord(24.5,7.5)):(yCoord(24.5,7.5)):(sprintf("Time Management")) with labels notitle,\
     '' using (0):(0):(5.5):(deg(33)-half):(deg(28)+half) with circles lw 5 dt 6 fs transparent solid 0.2 border lc "black" notitle,\
     '' using (xCoord(30.5,7.5)):(yCoord(30.5,7.5)):(sprintf("Aptitude")) with labels notitle,\
     '' using (0):(0):(1) with circles lw 1 fs transparent solid 0.0 border lc "black" notitle,\
     '' using (0):(0):(2) with circles lw 1 fs transparent solid 0.0 border lc "black" notitle,\
     '' using (0):(0):(3) with circles lw 1 fs transparent solid 0.0 border lc "black" notitle,\
     '' using (0):(0):(4) with circles lw 1 fs transparent solid 0.0 border lc "black" notitle,\
     '' using (0):(0):(5) with circles lw 1 fs transparent solid 0.0 border lc "black" notitle,\
     '' using (xCoord($1,5.75)):(yCoord($1,5.75)):(sprintf( "%d" , $2 )) with labels font "Courier,18" notitle,\
     '' using (0):(0):(xCoord($1,5.5)):(yCoord($1,5.5)) with vectors lc rgbcolor "black" nohead notitle,\
     '' using (xCoord($1,$3)):(yCoord($1,$3)) with lines lt -1 lw 10 lc rgbcolor "black" title "Student Response",\
     'inverse.dat' using (xCoord($1,5.75)):(yCoord($1,5.75)):(0.25) with circles lc rgbcolor "black" title "Negatively-Worded Questions",\
     'international.dat' using (xCoord($1,6.5)):(yCoord($1,6.5)):2 with labels font "Courier,18" title "[I]nternational Student Success Seminar Questions"