package com.lara;

class T4 extends Thread 
{
    public static void main(String [] args) 
    {
    	int[] x=null;
    	System.out.println(x[0]);
        T4 t = new T4();
        t.start();
        System.out.print("one. ");
        t.start();
        System.out.print("two. ");
    }
    public void run() 
    {
        System.out.print("Thread ");
    }
}
