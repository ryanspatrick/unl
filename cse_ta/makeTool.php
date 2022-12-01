<?php
   $nuid = $_POST['nuid'];    
   $name = $_POST['name'];
   $course = $_POST['course'];
   
   /*
   $nuid = "12345678";
   $name = "Ryan Patrick";
   $course = array(
   	   "CSCE10" => "CSCE10"
   );
   */


   $conn = new mysqli($servername, $username, $password, $db);

   if( $conn->connect_error ){
       echo "An error has occurred. Please contact <a href=\"mailto:rypat@unl.edu?subject=TA Signup Form\">Ryan Patrick</a>.";       
   }
   else{
	$sql = "SELECT nuid,login FROM view_login_nuid;";
	$result = $conn->query( $sql );
	$conn->close();

	if( $result->num_rows > 0 ){
	    $csename="NONE";
	    while( $row = $result->fetch_assoc() ){
	    	   if( $row["nuid"] == $nuid ){
		       /* echo $row["nuid"] . "\n"; */
		       $csename=$row["login"];
		       break;
		   }
	    }
	}
	else{
		$csename="NONE";
	}
   }

   $courses = array(
"CSCE10" => "CSCE10",
"CSCE100" => "CSCE100",
"CSCE101L" => "CSCE101L",
"CSCE101" => "CSCE101",
"CSCE120" => "CSCE120",
"CSCE155A" => "CSCE155A",
"CSCE155E" => "CSCE155E",
"CSCE155H" => "CSCE155H",
"CSCE155N" => "CSCE155N",
"CSCE155T" => "CSCE155T",
"CSCE156H" => "CSCE156H",
"CSCE156" => "CSCE156",
"CSCE163H" => "CSCE163H",
"CSCE183H" => "CSCE183H",
"CSCE184H" => "CSCE184H",
"CSCE191" => "CSCE191",
"CSCE192" => "CSCE192",
"CSCE194" => "CSCE194",
"CSCE220" => "CSCE220",
"CSCE230" => "CSCE230",
"CSCE231" => "CSCE231",
"CSCE235H" => "CSCE235H",
"CSCE235" => "CSCE235",
"CSCE251" => "CSCE251",
"CSCE283H" => "CSCE283H",
"CSCE291" => "CSCE291",
"CSCE292" => "CSCE292",
"CSCE294" => "CSCE294",
"CSCE310H" => "CSCE310H",
"CSCE310" => "CSCE310",
"CSCE311" => "CSCE311",
"CSCE320" => "CSCE320",
"CSCE322H" => "CSCE322H",
"CSCE322" => "CSCE322",
"CSCE335" => "CSCE335",
"CSCE336" => "CSCE336",
"CSCE351" => "CSCE351",
"CSCE361H" => "CSCE361H",
"CSCE361" => "CSCE361",
"CSCE370H" => "CSCE370H",
"CSCE378H" => "CSCE378H",
"CSCE378" => "CSCE378",
"CSCE383H" => "CSCE383H",
"CSCE391" => "CSCE391",
"CSCE392" => "CSCE392",
"CSCE394" => "CSCE394",
"CSCE399H" => "CSCE399H",
"CSCE399" => "CSCE399",
"CSCE401H" => "CSCE401H",
"CSCE402H" => "CSCE402H",
"CSCE403H" => "CSCE403H",
"CSCE404H" => "CSCE404H",
"CSCE405H" => "CSCE405H",
"CSCE406H" => "CSCE406H",
"CSCE410" => "CSCE410",
"CSCE411" => "CSCE411",
"CSCE412" => "CSCE412",
"CSCE413" => "CSCE413",
"CSCE421" => "CSCE421",
"CSCE423" => "CSCE423",
"CSCE424" => "CSCE424",
"CSCE425" => "CSCE425",
"CSCE428" => "CSCE428",
"CSCE430" => "CSCE430",
"CSCE435" => "CSCE435",
"CSCE436" => "CSCE436",
"CSCE438" => "CSCE438",
"CSCE439" => "CSCE439",
"CSCE440" => "CSCE440",
"CSCE441" => "CSCE441",
"CSCE447" => "CSCE447",
"CSCE451" => "CSCE451",
"CSCE454" => "CSCE454",
"CSCE455" => "CSCE455",
"CSCE456" => "CSCE456",
"CSCE457" => "CSCE457",
"CSCE458" => "CSCE458",
"CSCE459" => "CSCE459",
"CSCE460" => "CSCE460",
"CSCE461" => "CSCE461",
"CSCE462" => "CSCE462",
"CSCE463" => "CSCE463",
"CSCE464" => "CSCE464",
"CSCE465" => "CSCE465",
"CSCE466" => "CSCE466",
"CSCE467" => "CSCE467",
"CSCE468" => "CSCE468",
"CSCE470" => "CSCE470",
"CSCE471" => "CSCE471",
"CSCE472" => "CSCE472",
"CSCE473" => "CSCE473",
"CSCE474" => "CSCE474",
"CSCE475" => "CSCE475",
"CSCE476" => "CSCE476",
"CSCE477" => "CSCE477",
"CSCE478" => "CSCE478",
"CSCE479" => "CSCE479",
"CSCE486" => "CSCE486",
"CSCE487H" => "CSCE487H",
"CSCE487" => "CSCE487",
"CSCE488" => "CSCE488",
"CSCE489H" => "CSCE489H",
"CSCE489" => "CSCE489",
"CSCE492H" => "CSCE492H",
"CSCE492" => "CSCE492",
"CSCE493A" => "CSCE493A",
"CSCE493" => "CSCE493",
"CSCE495" => "CSCE495",
"CSCE498" => "CSCE498",
"SOFT160H" => "SOFT160H",
"SOFT160" => "SOFT160",
"SOFT161H" => "SOFT161H",
"SOFT161" => "SOFT161",
"SOFT162" => "SOFT162",
"SOFT260H" => "SOFT260H",
"SOFT260" => "SOFT260",
"SOFT261H" => "SOFT261H",
"SOFT261" => "SOFT261",
"SOFT360" => "SOFT360",
"SOFT401H" => "SOFT401H",
"SOFT402H" => "SOFT402H",
"SOFT403H" => "SOFT403H",
"SOFT403" => "SOFT403",
"SOFT404H" => "SOFT404H",
"SOFT404" => "SOFT404",
"SOFT460" => "SOFT460",
"SOFT461" => "SOFT461",
"SOFT466" => "SOFT466",
"SOFT467" => "SOFT467",
"SOFT468" => "SOFT468"
);   

   if( !( $fp = fopen( "responses.csv" , "a" ) ) || ( !( flock( $fp , LOCK_EX ) ) ) ){
       echo "An error has occurred. Please contact <a href=\"mailto:rypat@unl.edu?subject=TA Signup Form\">Ryan Patrick</a>.";
   }
   else{
	/*
	fprintf( $fp , "\"NUID\",\"USERNAME\",\"NAME\"" );
	foreach( $courses as $crse ){
		 fprintf( $fp , "\"%s\"," , $crse );
	}
	fprintf( $fp , "\n" );
	*/

	fprintf( $fp , "\"%08d\",\"%s@cse.unl.edu\",\"%s\"" , $nuid , $csename , $name );
	foreach( $courses as $crse ){
		 if( in_array( $crse , $course ) ){
		     fprintf( $fp , ",\"Y\"" );
		 }
		 else{
			fprintf( $fp , ",\"N\"" );
		 }
	}	
	fprintf( $fp , "\n" );
	fclose( $fp );
	echo "Thank you. Your response has been saved.\n";
   }
?>