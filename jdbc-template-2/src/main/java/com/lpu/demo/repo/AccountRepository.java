package com.lpu.demo.repo;

import java.util.List;

import com.lpu.demo.bean.Account;

public interface AccountRepository {
	public Account createAccount(Account account);
	public List<Account> getAllAccountDetails();
	public Account findByAccountNumber(String accountNumber);
	public void deleteById(String accountNumber);
	public void updateById(String accountNumber);
	public void deleteAll();
}
