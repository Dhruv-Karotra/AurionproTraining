package com.aurionpro.test;

import com.aurionpro.models.*;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount(1, "Dhruv", 10000);
		System.out.println(saving);
		printTransactionMessage(saving.deposit(1000));
		System.out.println(saving);
		printTransactionMessage(saving.withdraw(10000));
		System.out.println(saving);

		CurrentAccount current = new CurrentAccount(2, "Suswar", 10000);
		System.out.println(current);
		printTransactionMessage(current.deposit(1000));
		System.out.println(current);
		printTransactionMessage(current.withdraw(100000));
		System.out.println(current);
	}
	
	private static void printTransactionMessage(boolean transaction) {
		if(transaction) {
			System.out.println("Transaction successful");
		}
		else {
			System.out.println("Transaction fail");
		}
	}

}
