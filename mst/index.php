<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>MST Visualizer</title>
    </head>
    <body>
      <?php
	$dateFormat = "/usr/bin/date \"+%Y%m%d%H%M%S%N\"";
	$file = exec( $dateFormat , $exitCode );
	$cmdFormat = sprintf( "./animateMST.sh %s" , $file );
	exec( $cmdFormat , $exitCode );
	echo "<a href=\"" . $file . ".pdf\" download target=\"_blank\">PDF</a><br>";
	echo "<a href=\"" . $file . ".nodes.csv\" download target=\"_blank\">Nodes</a><br>";
	echo "<a href=\"" . $file . ".edge.csv\" download target=\"_blank\">Edges</a><br>";
	echo "<object type=\"image/gif\" data=\"" . $file . ".gif\"></object><br>\n";
	?>
    </body>
</html>
