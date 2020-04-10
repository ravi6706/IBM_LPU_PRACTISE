package com.lpu.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Name myName=context.getBean("myName",Name.class);
	System.out.print("Name: ");
	System.out.print(myName.getFirstName()+" ");
	System.out.println(myName.getLastName());
	System.out.println("Address: ");
	System.out.println(myName.getAddressLine1());
	System.out.println(myName.getAddressLine2());
    }
}
