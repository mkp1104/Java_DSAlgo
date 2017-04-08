package com.lara;

import java.util.LinkedList;
import java.util.Scanner;

public class T19 {
public static void main(String[] args) 
{
	
LinkedList list=new LinkedList();
Scanner sc=new Scanner(System.in);
String element=null;
String decider=null;
do
{
	System.out.println("Enter the Element");
	element=sc.next();
list.add(element);
System.out.println("do you want to enter more element y/n ?");
decider=sc.next();
}while(decider.equals("y"));
System.out.println(list);
if(list.size()%2!=0)
{
int index=(list.size())/2;
System.out.println("Middle Node Element="+list.get(index));
}
else
{
System.out.println("Please enter Odd Number Of Elements");	

}
}
}
