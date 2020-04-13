package com.lpu.demo.repo;

import com.lpu.demo.bean.Account;

public interface AccountRepository {
	
	public Account createAccount(Account account);
	
	public Account updateAccount(Account account);
	
	public Account deleteAccount(Account account);

}
