package com.lara;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T27 
{
public static void main(String[] args) throws IOException
{
File f=new File("xyz.txt");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);
File f1=new File("output1.txt");
File f2=new File("output2.txt");
FileWriter fw1=new FileWriter(f1);
FileWriter fw2=new FileWriter(f2);
String s=br.readLine();
String s1="002";
while(s!=null)
{
System.out.println(s);
Pattern pt=Pattern.compile(s1);
Matcher m=pt.matcher(s);
while(m.find())
{
	System.out.println(m.start());
	fw1.write(s);
	fw1.flush();
	fw1.close();
	fw1=fw2;
}
s=br.readLine();

}

br.close();
fw2.close();

}
}
