package com.lara;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
public class Manager34
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(90);
		list1.add(9);
		list1.add(0);
		list1.add(40);
		Iterator it=list1.iterator();
		//list1.add(50);
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		list1.add(50);
		
		System.out.println(list1);
	}
}
