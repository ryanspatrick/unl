<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Graph Generator</title>
	<style>
	  .thirds tr td { width:33%; }
	</style>
    </head>
    <body>
      <?php
	$dateFormat = "/usr/bin/date \"+%Y%m%d%H%M%S%N\"";
	$file = exec( $dateFormat , $exitCode );
	$cmd = sprintf( "bash ./makeUndirectedGraph.sh %s; bash ./makeDirectedGraph.sh %s; bash ./makeFlowGraph.sh %s" , $file , $file , $file );
	exec( $cmd , $exitCode );
	echo "<table class=\"thirds\" width=\"100%\">";
	$pre = sprintf( "<tr><td><a href=\"%sUndirected.pdf\" download target=_blank >PDF</a></td><td><a href=\"%sDirected.pdf\" download target=_blank>PDF</a></td><td><a href=\"%sFlow.pdf\" download target=_blank>PDF</a></td></tr>" , $file , $file , $file );
	echo $pre;
	$sec = sprintf( "<tr><td><a href=\"%sUndirected.nodes.csv\" download target=_blank>Nodes Data</a></td><td><a href=\"%sDirected.nodes.csv\" download target=_blank>Nodes Data</a></td><td><a href=\"%sFlow.nodes.csv\" download target=_blank>Nodes Data</a></td></tr>" , $file , $file , $file );
        echo $sec;
	$thd = sprintf( "<tr><td><a href=\"%sUndirected.edges.csv\" download target=_blank>Edges Data</a></td><td><a href=\"%sDirected.edges.csv\" download target=_blank>Edges Data</a></td><td><a href=\"%sFlow.edges.csv\" download target=_blank>Edges Data</a></td></tr>" , $file , $file , $file );
        echo $thd;
	$first = sprintf( "<tr><td><object type=\"image/svg+xml\" data=\"%sUndirected.svg\"></object></td><td><object type=\"image/svg+xml\" data=\"%sDirected.svg\"></object></td><td><object type=\"image/svg+xml\" data=\"%sFlow.svg\"></object></td></tr>" , $file , $file , $file );
	echo $first;
	echo "</table>";
	?>
    </body>
</html>
