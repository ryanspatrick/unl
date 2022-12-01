<h1></h1><html>
<body>

<?php
	$dateFormat = "/usr/bin/date \"+%Y%m%d%H%M%S%N\"";
	$date = exec( $dateFormat , $exitCode );
	$justDateFormat = "/usr/bin/date \"+%Y%m%d\"";
	$justDate = exec( $justDateFormat , $exitCode );
	$datafile = sprintf( "/home/fac/rpatrick/public_html/inventory/%s.dat" , $date );
	$responsefile = sprintf( "/home/fac/rpatrick/public_html/inventory/%sfree.txt" , $date );
	$tempfile = sprintf( "/home/fac/rpatrick/public_html/inventory/%s.temp" , $date );
	$cmd = sprintf( "export CLASSPATH=\"/home/fac/rpatrick/public_html/inventory/java/antlr-4.5.3-complete.jar:/home/fac/rpatrick/public_html/inventory/java\"; echo \"%s\" | /usr/bin/sed 's/\r$//g' | /usr/bin/java -Xmx2048m org.antlr.v4.gui.TestRig Inventory inventory 2> %s 1> %s; grep -e ^[0-9,.\-]*$ %s > %s; mv %s %s" , $_POST["inventory"] , $datafile , $responsefile , $datafile , $tempfile , $tempfile , $datafile );
	$output = exec( $cmd );	
	$logfile = sprintf( '/home/fac/rpatrick/public_html/inventory/%s.log' , $justDate );
	shell_exec( sprintf( "grep -a -f /home/fac/rpatrick/public_html/inventory/programs.txt %s >> %s" , $responsefile , $logfile ) );
	$gnuplotfile = sprintf( "/home/fac/rpatrick/public_html/inventory/%s.plt" , $date );
	$pdffile = sprintf( "/home/fac/rpatrick/public_html/inventory/%s.pdf" , $date );
	$psfile = sprintf( "/home/fac/rpatrick/public_html/inventory/%s.ps" , $date );
	$reportfile = sprintf( "/home/fac/rpatrick/public_html/inventory/%sreport.tex" , $date );
	shell_exec( sprintf( "sed 's/DATE/%s/g' /home/fac/rpatrick/public_html/inventory/template.plt > %s" , $date , $gnuplotfile ) );
	shell_exec( sprintf( "gnuplot %s; epstopdf --outfile=%s %s" , $gnuplotfile , $pdffile , $psfile ) );	
	shell_exec( sprintf( "sed 's/DATE/%s/g' /home/fac/rpatrick/public_html/inventory/template.tex > %s" , $date , $reportfile ) );
	shell_exec( sprintf( "pdflatex -interaction batchmode -output-directory /home/fac/rpatrick/public_html/inventory %s &> /home/fac/rpatrick/public_html/inventory/output.garbage" , $reportfile ) );
	shell_exec( sprintf( "chmod a+r /home/fac/rpatrick/public_html/inventory/%sreport.pdf" , $date ) );
	shell_exec( sprintf( "rm /home/fac/rpatrick/public_html/inventory/*garbage `ls /home/fac/rpatrick/public_html/inventory/%s* | grep -v -e report.pdf$ -e %s.log$`" , $date , $justDate ) );
	if( file_exists( "/home/fac/rpatrick/public_html/inventory/" . $date . "report.pdf" ) ){
	    echo "Here is the generated <a href=https://cse.unl.edu/~rpatrick/inventory/" . $date . "report.pdf download target=_blank>PDF</a>.\n";
	}
	else{
	    echo "The PDF was not generated correctly.\nMake sure you copy and paste the entire inventory into the text box.\nIf the problem persists, contact <a href=\"mailto:rypat@unl.edu?subject=NSE Advising Inventory Visualizer\">Ryan Patrick (rypat@unl.edu)</a>";	
	}
	
   ?><br>

</body>
</html>
