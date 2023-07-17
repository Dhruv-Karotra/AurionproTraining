package com.aurionpro.test;

import com.aurionpro.models.Account;
import com.aurionpro.models.AccountType;

import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		Account savingsAccount=new Account(101,"Laxman",5000,AccountType.SAVINGS);
		Account currentAccount=new Account(102,"Raj",50000,AccountType.CURRENT);
		System.out.println(savingsAccount);
		savingsAccount.deposit(10000);
		System.out.println(savingsAccount);
		if(savingsAccount.withdraw(100000)) {
			System.out.println("Withdrawl is successful");
		}
		else {
			System.out.println("Insufficient balance!");
		}
		
		System.out.println(currentAccount);
		currentAccount.deposit(10000);
		System.out.println(currentAccount);
		if(currentAccount.withdraw(80000)) {
			System.out.println("Withdrawl is successful");
		}
		else {
			System.out.println("Insufficient balance!");
		}
		System.out.println(currentAccount);
	}
}
