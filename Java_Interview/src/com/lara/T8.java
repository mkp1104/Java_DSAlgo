package com.lara;

public class T8 
{
public static void main(String[] args) 
{
	String in = "helllo goodbye";
	  String out = in.replaceAll("(.)(?=\\1)", "$1*");
//	  String out = in.replaceAll("matching pattern", "Replacing Pattern");
//	  String out = in.replaceAll("(.)(?=\\1)", "\\1*");
	  System.out.println(out);	
	  String s=in.replaceAll("(.)", "$1*");
	  System.out.println(s);
	  String s1=in.replaceAll("(.)", "\\1*");
	  System.out.println(s1);
	  String s2=in.replaceAll("(.)", "\\*2");
	  System.out.println(s2);
}
}
/*
 
(.)     //match any one character into group 1 
(?=\\1) //positive lookahead for that same character by backreferencing group 1
$1*     //replace that one character with the character followed by *

*/