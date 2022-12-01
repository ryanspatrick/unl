<h1></h1><html>
<body>

<?php
	$number = $_POST["url"];
	$dateFormat = "/usr/bin/date \"+%Y%m%d%H%M%S%N\"";
	$date = exec( $dateFormat , $exitCode );
	$htmlfile = sprintf( "/home/fac/rpatrick/public_html/moss/%s.html" , $date );
	$errfile  = sprintf( "/home/fac/rpatrick/public_html/moss/%s.err"  , $date );
	$csvfile  = sprintf( "/home/fac/rpatrick/public_html/moss/%s.csv"  , $date );
	$tempfile = sprintf( "/home/fac/rpatrick/public_html/moss/%s.temp.html" , $date );
	$cmd = sprintf( "/usr/bin/curl -Ns http://moss.stanford.edu/results/%s/ > %s" , $_POST["url"] , $htmlfile );
	$output = exec( $cmd );
	$cmd = sprintf( "/usr/bin/bash /home/fac/rpatrick/public_html/moss/convert.sh %s" , $htmlfile );
	$output = exec( $cmd );
	if( file_exists( "/home/fac/rpatrick/public_html/moss/" . $date . ".pdf" ) ){
	    echo "Here is the generated <a href=https://cse.unl.edu/~rpatrick/moss/" . $date . ".pdf download target=_blank>PDF</a>.<br>\n";
	    echo "<object type=\"image/svg+xml\" data=\"https://cse.unl.edu/~rpatrick/moss/" . $date . ".svg\"></object><br>\n";
	}
	else{
	    echo "The PDF was not generated correctly.\nMake sure you copy and paste just the number into the text box and that the MOSS page is still active.\nIf the problem persists, contact <a href=\"mailto:rypat@unl.edu?subject=MOSS Visualizer\">Ryan Patrick (rypat@unl.edu)</a>";	
	}
	
   ?><br>

</body>
</html>
