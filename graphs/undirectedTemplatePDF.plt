set terminal eps enhanced monochrome linewidth 3 font "Courier,12" background "#FFFFFF"

set output "FILE.eps"
set datafile sep ";"
set size square
set xrange [-1.25:1.25]
set yrange [-1.25:1.25]

unset border
unset xtics
unset ytics

myMod(v,m) = (v > m)?(v - m):v
nX(n,r) = r * cos( myMod( 5 * pi / 2 - ( n - 1 ) / NODES * 2 * pi , 2 * pi ) )
nY(n,r) = r * sin( myMod( 5 * pi / 2 - ( n - 1 ) / NODES * 2 * pi , 2 * pi ) )
angle(a,b) = atan2((nY(b,1) - nY(a,1)) , (nX(b,1) - nX(a,1))) + pi
startX(a,b) = nX(a,1) + 0.1 * cos( angle( b , a ) )
startY(a,b) = nY(a,1) + 0.1 * sin( angle( b , a ) )
dx(a,b) = startX( b , a ) - startX( a , b )
dy(a,b) = startY( b , a ) - startY( a , b )
edges=system( 'ls FILE.edges.*.csv' )

set key top right outside

plot 'FILE.nodes.csv' using (nX($1+1,1)):(nY($1+1,1)):(sprintf( "%c" , $1 + 65 )) with labels notitle,\
     '' using (nX($1+1,1)):(nY($1+1,1)):(0.1) with circles lt -1 notitle,\
     for [e in edges] e using (startX($1,$2)):(startY($1,$2)):(dx($1,$2)):(dy($1,$2)) with vectors nohead title columnhead(3)