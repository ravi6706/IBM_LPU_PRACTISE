package com.lpu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.demo.bean.Account;
import com.lpu.demo.repo.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	
	private AccountRepository accountRepository;

	@Autowired
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	
	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.createAccount(account);
	}

	
	

}
