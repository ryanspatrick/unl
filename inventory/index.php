<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
  <head>
    <style>
      textarea {
      width: 99%;
      height: 80%;
      resize: none
      }
    </style>
        <meta charset="UTF-8">
        <title>NSE Advising Inventory Visualizer</title>
    </head>
    <body>
      <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post" id="inventory">
	Advising Inventory Visualizer<br>
Make sure you copy and paste the text from the <b>entire inventory PDF</b> into the text box.<br>
<b>You may need to scroll through the entire inventory PDF before choosing Select All -> Copy -> Paste because some pages may be copied as images (and not text) otherwise.</b><br>
If you encounter any problems, contact <a href="mailto:rypat@unl.edu?subject=NSE Advising Inventory Visualizer">Ryan Patrick (rypat at unl dot edu)</a><br>
<a href="https://ant.umn.edu/yjcddqfxko/annotate">Video Tutorial</a><br>
<input type="submit" name="submit">
      </form>
      <div>
	<textarea name="inventory" form="inventory" cols="80" rows="20"></textarea><br>
	</div>
      <?php
	if( isset( $_POST['submit'] ) ){
	$dir = "/home/fac/rpatrick/public_html/inventory/";
	$url = "https://cse.unl.edu/~rpatrick/inventory/";
	$justDateFormat = "/usr/bin/date \"+%Y%m%d\"";
	$justDate = exec( $justDateFormat , $exitCode );
	$dateFormat = "/usr/bin/date \"+%Y%m%d%H%M%S%N\"";
	$file = exec( $dateFormat , $exitCode );
	$data = sprintf( "%s.dat" , $file );
	$response = sprintf( "%sfree.txt" , $file );
	$temp = sprintf( "%s.temp" , $file );
	$cmd = sprintf( "export CLASSPATH=\"/home/fac/rpatrick/public_html/inventory/java/antlr-4.5.3-complete.jar:/home/fac/rpatrick/public_html/inventory/java\"; echo \"%s\" | /usr/bin/sed 's/\r$//g' | /usr/bin/java -Xmx2048m org.antlr.v4.gui.TestRig Inventory inventory 2> %s 1> %s; grep -e ^[0-9,.\-]*$ %s > %s; mv %s %s" , $_POST["inventory"] , $dir . $data , $dir . $response , $dir . $data , $dir . $temp , $dir . $temp , $dir . $data );
	$output = exec( $cmd );
	$logfile = sprintf( "%s.log" , $justDate );
	shell_exec( sprintf( "grep -a -f %sprograms.txt %s >> %s" , $dir , $response , $logfile ) );
	$gnuplotfile = sprintf( "%s.plt" , $file );
	$pdffile = sprintf( "%s.pdf" , $file );
	$epsfile = sprintf( "%s.eps" , $file );
	$svgfile = sprintf( "%s.svg" , $file );
	$texfile = sprintf( "%sreport.tex" , $file );
	shell_exec( sprintf( "sed 's@FILE@%s@g' %stemplatePDF.plt > %s; gnuplot %s; epstopdf --outfile=%s %s" , $dir . $file , $dir , $dir . $gnuplotfile , $dir . $gnuplotfile , $dir . $pdffile , $dir . $epsfile ) );
	shell_exec( sprintf( "sed 's@FILE@%s@g' %stemplateSVG.plt > %s; gnuplot %s" , $dir . $file , $dir , $dir . $gnuplotfile , $dir . $gnuplotfile ) );
	shell_exec( sprintf( "sed 's/DATE/%s/g' template.tex > %s; pdflatex -interaction batchmode %s &> /dev/null" , $file , $dir . $texfile , $dir . $texfile ) );
	shell_exec( sprintf( "chmod a+r %s*.*; sleep 1s" , $dir . $file ) );
	echo "<a href=\"" . $file . "report.pdf\" " . "download target=\"_blank\">Download PDF</a>";
	echo "<pre>\n";
	include( $dir . $response );
	echo "</pre>\n";
	echo "<b>Question Guide</b><br>\n";
	echo "<i>Strongly Agree and Not Concerned Correspond to Largest Circle, Strongly Disagree and Very Concerned Correspond to Smallest Circle</i><br>";
	echo "<u>Concern</u><br>\n";
	echo "<pre>\n";
	include( $dir . "concern.txt" );
	echo "</pre>\n";
	echo "<u>Agreement</u><br>\n";
	echo "<pre>\n";
	include( $dir . "agreement.txt" );
	echo "</pre>\n";
	echo "<object type=\"image/svg+xml\" data=\"" . $url . $file . ".svg\"></object><br>\n";
	shell_exec( sprintf( "rm `ls %s*.* | grep -v -e pdf$ -e svg$`" , $dir . $file ) );
	}
	?>
    </body>
</html>
