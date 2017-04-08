package com;
class E
{
public static void main(String[] args) 
{
System.out.println("E.main()");	
}	
static 
{
System.out.println("E-sib");	
}
}
class F extends E
{
public static void main(String[] args) 
{
System.out.println("S-main");	
}	
static
{
System.out.println("F-SIB");	
}

}
class G extends F
{
	static
	{
		
		
	System.out.println("G-SIB");	
	}
}
public class Test1 
{
public static void main(String[] args) 
{
	System.out.println("Test1-MAin-B");
	G.main(args);
	System.out.println("Test1-main-e");
}
}
