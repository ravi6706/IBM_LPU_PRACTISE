package com.lpu;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.lpu.bean.Customer;
import com.lpu.service.CustomerService;
import com.lpu.service.CustomerServiceImpl;

public class App 
{
    
    	private static CustomerService service=null;
    	private static Scanner scanner=new Scanner(System.in);
    	static
    	{
    		service=new CustomerServiceImpl();
    	}
    	public static void main(String[] args) {
    		String name,email;
    		boolean available;
    		int choice=-1;
    		do {
    			System.out.println("1. Create a customer");
    			System.out.println("2. Display all customers");
    			System.out.println("3. Get customer by id");
    			System.out.print("Enter your choice:  ");
    			choice=scanner.nextInt();
    			switch (choice) {
    			case 1:
    				System.out.print("Enter customer name: ");
    				name=scanner.next();
    				System.out.print("Enter customer email: ");
    				email=scanner.next();
    				System.out.print("Enter if customer available or not:");
    				available=scanner.nextBoolean();
    				Customer customer = new Customer();
    				customer.setCustomerName(name);
    				customer.setCustomerEmail(email);
    				customer.setActive(available);
    				customer.setCustomerId(UUID.randomUUID().toString());
    				customer=service.createCustomer(customer);
    				System.out.println(customer);
    				break;
    			case 2:
    				List<Customer> list=service.getAllCustomer();
    				for(Customer c:list)
    				{
    					System.out.println(c);
    				}
    				break;
    			case 3:
    				System.out.print("Enter customer ID: ");
    				customer=service.getCustomerByID(scanner.next());
    				if(customer==null)
    				{
    					System.out.println("No customer found with given ID: ");
    				}
    				else
    				{
    					System.out.println(customer);
    				}
    				break;
    			case 0:
    				System.out.println("Shutting down!!");
    				System.exit(0);
    			default:
    				System.out.println("Invalid Choice.");
    				break;
    			}
    			
    			
    		} while (choice !=0);
    		

    }
}
