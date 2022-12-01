<?php

	/*
		assume NUIDs are provided via stdin (one per row)
	*/



   	$conn = new mysqli( $servername , $username , $password , $db );

   	if( $conn->connect_error ){
       	    echo "An error has occurred.";       
   	    }
   else{
	$sql = "SELECT nuid,login FROM view_login_nuid;";
	$result = $conn->query( $sql );
	$conn->close();

	$users = array();

	while( $row = $result->fetch_assoc() ){
	       $users[$row["nuid"]] = $row["login"];
	}

	while( $user = trim( fgets( STDIN ) ) ){
	       echo $users[$user] . "," . $user . "\n";
	}
}
?>