package com.lara;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class T25 
{
public static void main(String[] args) throws Exception 
{
File f=new File("abc.txt");

FileReader fr1=new FileReader("abc.txt");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr1);
//BufferedReader br=new BufferedReader("abc.txt");
long   i=f.length();
char c[]=new char[(int)i];
fr.read(c);
fr.close();
String s=new String(c);
System.out.println("trough FileReader:"+s);
String s1=br.readLine();
if(s1!=null)
{
System.out.println("Through Buffered Reader:");
}
while(s1!=null)
{
System.out.println(s1);
s1=br.readLine();
}
}
}
