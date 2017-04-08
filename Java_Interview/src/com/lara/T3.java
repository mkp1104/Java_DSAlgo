package com.lara;
import java.util.ArrayList;
public class T3
{
public static void main(String[] args) 
{
String s=new String("abc");
String s1=new String("abc");
System.out.println(s==s1);
System.out.println(s.equals(s1));

String bb = "abc";
String aa = new String("abc");
System.out.println(bb==aa);
System.out.println(aa.equals(bb));
System.out.println(aa.hashCode());
System.out.println(bb.hashCode());
System.out.println(aa.toString());
System.out.println(bb.toString());
ArrayList a=new ArrayList();
a.add(12);
a.add(10);
a.add(14);
a.add(15);
a.add(17);
System.out.println(a);

}
}
