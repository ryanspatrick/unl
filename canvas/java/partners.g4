grammar partners;

@members{
	int group = 1;
}

file : ( { System.out.format( "--------" ); } partners )* EOF;
partners : ( p01=user p02=user { System.out.format( "\n%d\n%s%s" , group , $p01.text , $p02.text ); group++; } ) | ( pA=user pB=user pC=user { System.out.format( "\n%d\n%s%s%s" , group , $pA.text , $pB.text , $pC.text ); group++; } );
user : LINE;
LINE : (.)*? . ( '\r' )? ( '\n' );