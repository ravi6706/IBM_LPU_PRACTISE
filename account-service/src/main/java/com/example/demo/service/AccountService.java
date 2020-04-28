package com.example.demo.service;

import com.example.demo.model.Account;

public interface AccountService {
	
	public Iterable<Account> getAllAccounts();
	public Account findById(int id);
	public Account findByCustomerId(String customerId);

}
