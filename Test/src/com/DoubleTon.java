package com;
class DT
{
private DT()
{
System.out.println("DT-Constr");	
}
static private int index;  
private static DT[] ton=new DT[2];
		static 
{
 ton[0]=new DT();	
 ton[1]=new DT();	
}
public static DT getObject()
{
return ton[(index++)%2];	
}

}

public class DoubleTon 
{
public static void main(String[] args) 
{
//DT dt=new DT();
DT dt0=DT.getObject();
DT dt1=DT.getObject();
DT dt2=DT.getObject();
DT dt3=DT.getObject();
DT dt4=DT.getObject();
DT dt5=DT.getObject();
System.out.println(dt0);
System.out.println(dt1);
System.out.println(dt2);
System.out.println(dt3);
System.out.println(dt4);
System.out.println(dt5);
}
}