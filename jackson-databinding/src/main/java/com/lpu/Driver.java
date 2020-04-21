package com.lpu;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
//			// read JSON from file and map/convert to Java POJO
//			Customer myCustomer = mapper.readValue(new File("data/sample.json"), Customer.class);
//			
//			// also print individual items
//			System.out.println("First name = " + myCustomer.getFirstName());
//			System.out.println("Last name = " + myCustomer.getLastName());		
//
//			// get nested object: array
//			Address tempAddress = myCustomer.getAddress();
//			System.out.println("Street = " + tempAddress.getStreet());		
//			System.out.println("City = " + tempAddress.getCity());	
			String[] languages = {"hindi", "english"};
			Address address = new Address();
			address.setStreet("Nehru Road");
			address.setCity("Jaipur");
			address.setState("Rajasthan");
			address.setCountry("India");
			address.setZip("202213");
			Customer customer = new Customer();
			customer.setId(1234);
			customer.setFirstName("Ravi");
			customer.setLastName("Kumar");
			customer.setAddress(address);
			customer.setLanguages(languages);
			customer.setActive(true);
			
			String jsonStr = mapper.writeValueAsString(customer); 
			System.out.println(jsonStr); 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}