package com.lara;

import java.io.File;

public class T24 
{
public static void main(String[] args) throws Exception
{
File f=new File("T2.class");	

System.out.println("f.getAbsolutePath()---"+f.getAbsolutePath());
System.out.println("f.getCanonicalPath()---"+f.getCanonicalPath());
System.out.println("f.getFreeSpace()---"+f.getFreeSpace());
System.out.println("f.getName()--"+f.getName());
System.out.println("f.getParent()--"+f.getParent());
System.out.println("f.getPath()--"+f.getPath());
System.out.println("f.getTotalSpace()--"+f.getTotalSpace());
System.out.println("f.getUsableSpace()--"+f.getUsableSpace());
System.out.println("f.getAbsoluteFile()--"+f.getAbsoluteFile());
System.out.println("f.getCanonicalFile()--"+f.getCanonicalFile());
System.out.println("f.getClass()---"+f.getClass());
System.out.println("f.getParentFile()---"+f.getParentFile());
}
}
