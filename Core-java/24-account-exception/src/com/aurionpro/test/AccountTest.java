package com.aurionpro.test;
import com.aurionpro.models.Account;
import com.aurionpro.models.InsufficientBalanceException;

public class AccountTest {
	public static void main(String[] args) {
		Account acc=new Account(1,"Dhruv",10000);
		
		try{
			acc.withdraw(9500);
		}catch(InsufficientBalanceException e){
			System.out.println(e);
		}
	}
}
