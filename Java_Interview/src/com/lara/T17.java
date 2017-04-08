package com.lara;

import java.util.Scanner;

public class T17 
{
public static void main(String[] args) {
/*
 * a=a*b;
 * b=((a*b)/b)=a;
 * a=((a*b)b=a)=b;
 * 
 * 
 * 
 */
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a and b");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("a="+a);
System.out.println("b="+b);
a=a*b;
b=a/b;
a=a/b;
System.out.println("a="+a);
System.out.println("b="+b);
}
}
