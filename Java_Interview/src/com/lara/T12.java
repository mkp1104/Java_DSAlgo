package com.lara;
import java.util.*;
public class T12 
{
public static void main(String[] args) 
{
int[] x={1,2,3,4,5,6};
String s="abcdef";
StringBuffer sb=new StringBuffer("abcd");
System.out.println(sb);
sb.deleteCharAt(2);
System.out.println(sb);
ArrayList list=new ArrayList();

list.add(1);
list.add(2);
list.add(3);
list.add(4);
System.out.println(list);
list.remove(2);
System.out.println(list);
LinkedList llist=new LinkedList();
llist.add(1);
llist.add(2);
llist.add(3);
llist.add(4);
llist.add(5);
System.out.println(llist);
llist.remove(3);
System.out.println(llist);
}
}
