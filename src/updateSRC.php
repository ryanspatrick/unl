<?php
   header( 'Location: https://cse.unl.edu/~rpatrick/src/index.html' );
   $time = strftime( "%Y-%m-%d %H:%M:%S %z" , $_SERVER["REQUEST_TIME"] );
   $ip = $_SERVER["REMOTE_ADDR"];
   $user = $_POST['user'];
      
   $inFilename = "in.csv";
   $outFilename = "out.csv";

   if( $user != "" ){
       if( $_POST['in'] ){
       	   file_put_contents( $inFilename , $user . "," . $time . "," . $ip  . "\n" , FILE_APPEND | LOCK_EX );
       }
       else{
	   file_put_contents( $outFilename , $user . "," . $time . "," . $ip . "\n" , FILE_APPEND | LOCK_EX );
       }
       
       exec( "bash updateSRC.sh" );
   }
   else{
	echo "You must select a user to sign in or sign out.";
   }
?>