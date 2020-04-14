package com.lpu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.demo.bean.Account;
import com.lpu.demo.repo.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{
	
	private AccountRepository accountRepository;

	@Autowired
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	public Account createAccount(Account account) {
		return accountRepository.createAccount(account);
	}

	public List<Account> getAllAccountDetails() {
		
		return accountRepository.getAllAccountDetails();
	}

	public Account findByAccountNumber(String accountNumber) {
		
		return accountRepository.findByAccountNumber(accountNumber);
	}
	
	public void deleteById(String accountNumber) {
		accountRepository.deleteById(accountNumber);
	}

	public void updateById(String accountNumber)
	{
		accountRepository.updateById(accountNumber);
	}

	public void deleteAll() {
		accountRepository.deleteAll();
	}

}
