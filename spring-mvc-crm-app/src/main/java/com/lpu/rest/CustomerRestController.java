package com.lpu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.entity.Customer;
import com.lpu.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		
		return customerService.getCustomers();
		
	}
	
	@GetMapping("/getCustomer/{id}")
	 public Customer getCustomerById(@PathVariable int id) {
		Customer customer = customerService.getCustomerById(id);
		
		if (customer == null) {
			throw new CustomerNotFoundException("Customer id not found - " + id);
		}
		
		return customer;
	 }
	
	@PostMapping("/addCustomer")
	public Customer createCustomer(@RequestBody Customer customer) {
		customer.setId(0);
		return customerService.createCustomer(customer);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public Customer deleteCustomer(@PathVariable int id) {
		Customer customer=customerService.getCustomerById(id);
		if (customer == null) {
			throw new CustomerNotFoundException("Customer id not found - " + id);
		}
		customerService.deleteCustomer(id);
		return customer;
	}
		
	
}
