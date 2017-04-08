package com.lara;
import java.util.regex.*;
public class T13 
{
public static void main(String[] args) 
{
	String s="fjdjhgw#KSDVDSFH";
	String s1="#";
	Pattern pt=Pattern.compile(s1);
	Matcher m=pt.matcher(s);
	int index=0;
	while(m.find())
	{
		index=m.start();
		
	}
	StringBuffer sb=new StringBuffer(s);
	sb.deleteCharAt(index);
	System.out.println(sb);

	
}
}
