package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDAO;
import com.example.demo.model.Account;

@Service
public class AccountServiceImpl implements AccountService {
	
	private AccountDAO accountDAO;
	

	@Autowired
	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}


	@Override
	public Iterable<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountDAO.findAll();
	}


	@Override
	public Account findById(int id) {
		// TODO Auto-generated method stub
		return accountDAO.findById(id);
	}


	@Override
	public Account findByCustomerId(String customerId) {
		// TODO Auto-generated method stub
		return accountDAO.findByCustomerId(customerId);
	}

}
