package com.lpu.demo;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lpu.demo.bean.Account;
import com.lpu.demo.bean.AccountType;
import com.lpu.demo.service.AccountService;
import com.lpu.demo.service.AccountServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	AccountService service = context.getBean("accountServiceImpl",AccountServiceImpl.class);
    	
		Account account=context.getBean("account",Account.class);
		String str[]=UUID.randomUUID().toString().split("-");
		account.setAccountNumber(str[0]);
		account.setAccountType(AccountType.CREDIT_CARD);
		account.setInitialBalance(100000);
	
		account=service.createAccount(account);
		System.out.println(account);
    }
}
