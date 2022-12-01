<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Three Jugs Problem Visualizer</title>
    </head>
    <body>
      <?php
	$dateFormat = "/usr/bin/date \"+%Y%m%d%H%M%S%N\"";
	$file = exec( $dateFormat , $exitCode );
	$cmdFormat = sprintf( "./animateJugs.sh %s" , $file );
	exec( $cmdFormat , $exitCode );
	echo "<object type=\"image/gif\" data=\"" . $file . ".gif\"></object><br>\n";
	?>
    </body>
</html>
