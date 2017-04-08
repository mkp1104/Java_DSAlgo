package com.lara;

public class T11 
{
public static void main(String[] args) 
{
String s="XXyYYY";	
System.out.println(s.charAt(0));
StringBuffer st=new StringBuffer(s);
for(int i=0;i<s.length()+1;i++)
{
if(st.charAt(i)==st.charAt(i+1))
{
st.insert(i+1,"*");	
i++;
}


}
System.out.println(st);
}
}
