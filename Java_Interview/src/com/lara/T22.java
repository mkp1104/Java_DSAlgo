package com.lara;

import java.util.ArrayList;
import java.util.Iterator;

class Producer extends Thread
{
	
ArrayList list;
Producer(ArrayList list)
{
	this.list=list;
}
public synchronized void run()
{
for(int i=list.size();i<=6;i++)
{
	System.out.println("Producer has Produced="+i);
	list.add(i);	
	try
	{
		wait(20);
		
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
		
	}
}
System.out.println("Container Of Producer has been Fulled..Please tell Customer to take some Product....");
}

}
class Customer extends Thread
{
	
	ArrayList list;
	Customer(ArrayList list)
	{
		
		this.list=list;
		
	}
	Iterator it;
	
	public synchronized void run()
	{
		 it=list.iterator();
		while(it.hasNext())
		{
			System.out.println("Customer has Taken="+it.next());
			it.remove();
		}
		System.out.println("Producer Don't have Any Product..tell them to Produce");
		
	}	
}
public class T22 
{
public static void main(String[] args) 
{
	int size=6;
ArrayList list=new ArrayList();
Producer p=new Producer(list);
Customer c=new Customer(list);
p.start();
c.start();
	
}
}
