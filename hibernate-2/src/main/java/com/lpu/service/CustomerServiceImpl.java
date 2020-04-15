package com.lpu.service;

import java.util.List;

import com.lpu.bean.Customer;
import com.lpu.dao.CustomerDAO;
import com.lpu.dao.CustomerDAOImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDAO dao;
	
	{
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return dao.getAllCustomer();
	}

	@Override
	public Customer getCustomerByID(String customerId) {
		
		return dao.getCustomerByID(customerId);
	}

	@Override
	public Customer updateById(Customer customer) {
		
		return dao.updateById(customer);
	}

}
