package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {
	
	@Autowired
	RestTemplate restTemplate;
	
public List<Object> getAccounts() {
		
		return (List<Object>) restTemplate.getForObject("http://ACCOUNT-SERVICE/accounts",List.class);
  }

}
