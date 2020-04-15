package com.lpu.service;

import java.util.List;

import com.lpu.bean.Customer;

public interface CustomerService {
	
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer getCustomerByID(String customerId);
	public Customer updateById(Customer customer);

}
