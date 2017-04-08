package com;

//SingleTone design pattern !!!!!!!!!!!!!!!!
class T
{
private static T obj=null;
static 
{
obj=new T();
}
private T()
{
System.out.println("Test2()");	
}
public static T getObject()
{
return obj;	
}
}
public class SingleTon
{
public static void main(String[] args) 
{
//Test2 t1=new Test2();
T t1=T.getObject();
T t2=T.getObject();
T t3=T.getObject();
T t4=T.getObject();
T t5=T.getObject();
}
	
}