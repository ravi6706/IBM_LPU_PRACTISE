package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.AccountDAO;
import com.example.demo.model.Account;

@SpringBootApplication
public class AccountServiceApplication implements CommandLineRunner{
	
	private AccountDAO accountDAO;
	
	@Autowired
	public AccountServiceApplication(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		accountDAO.save(new Account(UUID.randomUUID().toString(),"234732587"));
		accountDAO.save(new Account(UUID.randomUUID().toString(),"227868621"));
		
	}

}
