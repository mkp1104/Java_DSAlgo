package com;
abstract class Abst
{
int i=12;
abstract  void test();
//int test1();
}
 class Test41 extends Abst 
{
void test()
{}


}
 public class Test4
 {
public static void main(String[] args) {
	

	 Test41 t=new Test41();
System.out.println(t.i);
}	 
 
}
