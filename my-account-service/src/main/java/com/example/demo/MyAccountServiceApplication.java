package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.support.RibbonRequestCustomizer.Runner;

import com.example.demo.dao.AccountDAO;
import com.example.demo.entity.Account;

@SpringBootApplication
@EnableDiscoveryClient
public class MyAccountServiceApplication implements CommandLineRunner{

	private AccountDAO accountDAO;
	
	@Autowired
	public MyAccountServiceApplication(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyAccountServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		accountDAO.save(new Account(UUID.randomUUID().toString(),"234732587"));
		accountDAO.save(new Account(UUID.randomUUID().toString(),"227868621"));
		
		
	}

}
