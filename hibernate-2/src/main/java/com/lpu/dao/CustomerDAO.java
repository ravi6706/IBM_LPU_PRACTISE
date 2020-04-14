package com.lpu.dao;

import java.util.List;

import com.lpu.bean.Customer;

public interface CustomerDAO {
	
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();

}
