package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.AccountDAO;
import com.example.demo.entity.Account;

@Service
@EnableTransactionManagement
public class AccountServiceImpl implements AccountService {
	
	private AccountDAO accountDAO;
	
	@Autowired
	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}


	@Override
	@Transactional
	public Iterable<Account> findAllAccounts() {
		// TODO Auto-generated method stub
		return accountDAO.findAll();
	}


	@Override
	@Transactional
	public Account findById(int id) {
		// TODO Auto-generated method stub
		return accountDAO.findById(id).get();
	}



	@Override
	@Transactional
	public Account findByCustomerId(String customerId) {
		// TODO Auto-generated method stub
		return accountDAO.findByCustomerId(customerId);
	}

}
