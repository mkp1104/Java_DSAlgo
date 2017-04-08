package com.lara;

import java.util.*;

public class T23
{public static void main(String[] args) {
	

	LinkedList linkedList= new LinkedList(); 
	linkedList.appendIntoTail(new LinkedList.Node("101"));
	LinkedList.Node cycle = new LinkedList.Node("201");
	linkedList.appendIntoTail(cycle); 
	linkedList.appendIntoTail(new LinkedList.Node("301")); 
	linkedList.appendIntoTail(new LinkedList.Node("401")); 
	linkedList.appendIntoTail(cycle);
	//don't call toString method in case of cyclic linked list, it will throw OutOfMemoryError //
	System.out.println("Linked List : " + linkedList); 
	if(linkedList.isCyclic())
	{
		System.out.println("Linked List is cyclic as it contains cycles or loop"); 
		}
	else
	{
		System.out.println("LinkedList is not cyclic, no loop or cycle found");
		}
	
	
}	
	}

	//javarevisited.blogspot.com/2013/05/find-if-linked-list-contains-loops-cycle-cyclic-circular-check.html#ixzz2zjyv7dae}
