package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;

@RestController
//@RequestMapping("/api")
public class AccountController {
	
	private AccountService accountService;

	@Autowired
	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	@GetMapping("/accounts")
	public Iterable<Account> findAllAccounts() {
		return accountService.findAllAccounts();
	}
	
	@GetMapping("/accounts/id/{id}")
	public Account findById(@PathVariable int id) {
		return accountService.findById(id);
	}
	
	@GetMapping("/accounts/customerid/{customerId}")
	public Account findByCustomerId(@PathVariable String customerId){
		return accountService.findByCustomerId(customerId);
	}
	

}
