package com.example.demo.service;

import com.example.demo.entity.Account;

public interface AccountService {
	
	public Iterable<Account> findAllAccounts();
	public Account findById(int id);
	public Account findByCustomerId(String customerId);

}
