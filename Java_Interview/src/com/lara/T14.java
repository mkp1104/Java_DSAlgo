package com.lara;
public class T14
{
	 
    public static void main(String args[]){
    
        for(int i = 1; i <= 50; i++) {
            if(i % (3*5) == 0) System.out.println("i="+i+"=FizzBuzz");
            else if(i % 5 == 0) System.out.println("i="+i+"=Buzz");
            else if(i % 3 == 0) System.out.println("i="+i+"=Fizz");
            else System.out.println("i="+i);
        } 
    } 

}