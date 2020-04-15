package com.lpu.dao;

import java.util.List;

import com.lpu.bean.Customer;

public interface CustomerDAO {
	
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer getCustomerByID(String customerId);
	public Customer updateById(Customer customer);

}
