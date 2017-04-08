package com.lara;

public class T9 
{
	public static void main(String[] args) 
	{
	String s="Helllo Maanish";
	System.out.println(add_star_between_same_char(s));
	}
public static StringBuffer add_star_between_same_char(String s)
{
	char BaseChar=s.charAt(0);
	StringBuffer st=new StringBuffer();
	st.append(BaseChar);
	char currentchar;
	for(int i=1;i<s.length();i++)
	{
		currentchar=s.charAt(i);
		if(BaseChar==currentchar)
		{
			st.append("*");
			
		}
		st.append(currentchar);
		BaseChar=currentchar;
	}
	
return st ; 	
}
}
