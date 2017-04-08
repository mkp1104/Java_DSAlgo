package com.lara;

import java.util.LinkedList;
import java.util.List;

public class T16 
{
public static void main(String[] args) 
{
LinkedList llist=new LinkedList();
llist.add(1);
llist.add(1);
llist.add(1);
llist.add(1);
System.out.println(llist);
llist.add(0,2);
llist.add(0);
System.out.println(llist);
llist.set(0,3);
List l1=llist.subList(0, 3);
System.out.println(llist);
System.out.println(l1);
}
}
