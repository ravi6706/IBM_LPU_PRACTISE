package com.lpu.service;

import java.util.List;

import com.lpu.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	public Customer getCustomerById(int id);
	public Customer createCustomer(Customer customer);
	public void deleteCustomer(int id) ;

}
