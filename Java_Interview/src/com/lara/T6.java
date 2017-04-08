package com.lara;
import java.text.ParseException;
import java.util.*;
public class T6
{
public static void main(String[] args) 
{

	String str = "Sep 17, 2013";
	Date date=null;
	try{

		 date = new DateFormat("MMMM d, yy", Locale.ENGLISH).parse(str);
	}
	catch(ParseException e)
	{
		
		
	}
	System.out.println(date);
	
}	
}
