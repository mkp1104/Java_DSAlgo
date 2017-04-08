package com.lara;

public class T1 
{
public static void main(String[] args) 
{
String s=new String("abc");
String s1="xyz".concat(s);
System.out.println(s1);
StringBuffer s2=new StringBuffer("abc");
String s3="abc".concat("abc");
System.out.println(s3);
}
}
