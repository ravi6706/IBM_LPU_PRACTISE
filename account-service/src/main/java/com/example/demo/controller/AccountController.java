package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {
	
	private AccountService accountService;

	@Autowired
	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	@RequestMapping("/accounts")
	public Iterable<Account> getAllAccounts(){
		return accountService.getAllAccounts();
	}
	
	@RequestMapping("/accounts/id/{id}")
	public Account findById(@PathVariable int id) {
		return accountService.findById(id);
	}
	
	@RequestMapping("/accounts/customerid/{customerId}")
	public Account findByCustomerId(@PathVariable String customerId) {
		return accountService.findByCustomerId(customerId);
	}
	

}
