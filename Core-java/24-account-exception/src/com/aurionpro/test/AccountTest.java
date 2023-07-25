package com.aurionpro.test;
import com.aurionpro.models.Account; 
import com.aurionpro.models.InsufficientBalanceException;

public class AccountTest {
	public static void main(String[] args) {
		Account account=new Account(1,"Dhruv",10000);
		System.out.println(account);
		try{
			account.withdraw(9990);
			System.out.println(account);
			
		}catch(InsufficientBalanceException e){
			System.out.println(e.getMessage());
		}
	}
}
