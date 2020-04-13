package com.lpu.demo.service;

import com.lpu.demo.bean.Account;

public interface AccountService {
	
	public Account createAccount(Account account);
	
	public Account updateAccount(Account account);
	
	public Account deleteAccount(Account account);

}
