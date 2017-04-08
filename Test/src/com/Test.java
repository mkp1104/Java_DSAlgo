
package com;
class A
{}
class B extends A
{}
class C extends B
{}
class D extends C
{}

public class Test 
{
public static void main(String[] args) 
{

//	A a1=new B();
//	B b1=(B)a1;
	B b2=(B)new A();
	
}
}
