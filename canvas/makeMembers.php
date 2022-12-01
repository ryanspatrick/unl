<?php

   $assignment = $_POST['assignment'];
   $number = $_POST['number'];
   $user = $_POST['user'];
   $partner01 = $_POST['partner01'];
   $partner02 = $_POST['partner02'];
   $partner03 = $_POST['partner03'];

   $filename = "members" . $number . $assignment . ".txt";
   $dir = "members" . $number . $assignment . "/" . $user;
      
   if( $user != "" ){
       $cmd = "mkdir -p " . $dir . "; chmod a+x " . $dir . ";";
       $com = exec( $cmd );
       file_put_contents( $dir . "/" . $filename , $user . "\n" );
   
   if( $partner01 != "" && $user != "" ){
       file_put_contents( $dir . "/" . $filename , $partner01 . "\n" , FILE_APPEND | LOCK_EX );
   }
   if( $partner02 != "" && $user != "" ){
       file_put_contents( $dir . "/" . $filename , $partner02 . "\n" , FILE_APPEND | LOCK_EX );
   }
   if( $partner03 != "" && $user != "" ){
       file_put_contents( $dir . "/" . $filename , $partner03 . "\n" , FILE_APPEND | LOCK_EX );
   }

   exec( "chmod a+r " . $dir . "/" . $filename );

   echo $user . "/" . $filename . " Created";

   if( $assignment == "lab" ){
       exec( "bash copyFile.sh " . $dir . "/" . $filename . " /home/grad/Classes/cse155n/handin/00" . $number . "/" . $user . "/" . $filename );
   }
   else{
	exec( "bash copyFile.sh " . $dir . "/" . $filename . " /home/grad/Classes/cse155n/handin/01" . $number . "/" . $user . "/" . $filename );	
   }
   }
   else{
	echo "You must select a user to create the members file for.";
   }  
?>