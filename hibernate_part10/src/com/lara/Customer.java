package com.lara;
import org.hibernate.Session;
public class Customer 
{
public static void main(String[] args) 
{
Session s1=Util.openSession();
Product p1=new Product();
p1.setId(1);
p1.setProductName("TV");
p1.setPrice(50000);
Product p2=new Product();
p2.setId(2);
p2.setProductName("Mobile");
p2.setPrice(25000);
s1.beginTransaction();
s1.save(p1);
s1.save(p2);
s1.getTransaction().commit();

s1.flush();
s1.close();
}
}
