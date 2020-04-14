package com.lpu.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lpu.demo.bean.Account;
import com.lpu.demo.bean.AccountType;
import com.lpu.demo.config.JDBCConfig;
import com.lpu.demo.service.AccountService;
import com.lpu.demo.service.AccountServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JDBCConfig.class);
		
		AccountService service = context.getBean("accountServiceImpl",AccountServiceImpl.class);
		Account account=context.getBean("account",Account.class);
		
		Scanner sc = new Scanner(System.in);
		int ch=0;
		while(ch!=7)
		{
			System.out.println("1. Create an account");
			System.out.println("2. Display All Accounts");
			System.out.println("3. Find Account By Account Number");
			System.out.println("4. Delete Account By Account Number");
			System.out.println("5. Update Account By Account Number");
			System.out.println("6. Delete all accounts");
			System.out.println("7. Exit");
			
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
			{
				String str[]=UUID.randomUUID().toString().split("-");
				account.setAccountNumber(str[0]);
				account.setAccountType(AccountType.LOAN);
				System.out.println("ENTER THE BALANCE:");
				int bal = sc.nextInt();
				account.setInitialBalance(bal);
				service.createAccount(account);
			}
			break;
			
			case 2:
			{
				List<Account> list=service.getAllAccountDetails();
				Iterator<Account> i=list.iterator(); 
				  while(i.hasNext()) 
				  { 
					  Account account2=i.next();
					  System.out.println(account2);
				  }
			}
			break;
			
			case 3:
			{
				System.out.println("ENTER THE ACCOUNT NUMBER YOU WANT TO SEARCH:");
				String acc_no = sc.next();
				account=service.findByAccountNumber(acc_no);
				System.out.println(account);
			}
			break;
			
			case 4:
			{
				System.out.println("ENTER THE ACCOUNT NUMBER YOU WANT TO DELETE:");
				String acc_no = sc.next();
				service.deleteById(acc_no);
			}
			break;
			
			case 5:
			{
				System.out.println("ENTER THE ACCOUNT NUMBER YOU WANT TO UPDATE:");
				String acc_no = sc.next();
				service.updateById(acc_no);
			}
			break;
			
			case 6:
			{
				System.out.println("DELETING ALL RECORDS......");
				service.deleteAll();
			}
			break;
			case 7:
				System.out.println("Application shutting down......");
				break;
			}
		
		
    }
}
}
