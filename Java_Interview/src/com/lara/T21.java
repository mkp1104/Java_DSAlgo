package com.lara;

import java.util.Scanner;

class Emp
{
	private String Name;
	private String Dept;
	private double Weight;
	Emp(String Name,String Dept,double Weight)
	{
		this.Name=Name;
		this.Dept=Dept;
		this.Weight=Weight;
		
	}
	
	
}
public class T21 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Name of Employee");
String Name=sc.next();
System.out.println("Enter the Dept of Employee");
String Dept=sc.next();
System.out.println("Enter the Weight of Employee");
double Weight=sc.nextDouble();
Emp(Name,Dept,Weight);

}
}
