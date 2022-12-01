grammar Courses;

file : ( prefix '\n' number '\n' title '\n' { System.out.printf( "<input type=\"checkbox\" name=\"course[]\" value=\"%s%s\"><tt>%s %-4s: %s</tt><br>\n" , $prefix.text , $number.text , $prefix.text , $number.text , $title.text ); } )* EOF;

prefix : 'CSCE' | 'SOFT';
number : ( HONORS | NUMBER );
HONORS : ('0'..'9')+('A'..'Z');
NUMBER : ('0'..'9')+;
UPPER : 'A'..'Z';
LOWER : 'a'..'z';
title : ( NUMBER | UPPER | LOWER | ' ' | '-' | ':' | ',' )+;