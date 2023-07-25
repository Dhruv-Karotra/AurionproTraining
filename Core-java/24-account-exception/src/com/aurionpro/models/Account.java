package com.aurionpro.models;
import com.aurionpro.models.InsufficientBalanceException;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private static final int MIN_BALANCE=1000;
	
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			return true;
		}
		return false;
	}
//	
//	public void withdraw(double amount) {
//		if(balance-amount<MIN_BALANCE) {
//			throw new InsufficientBalanceException(balance,amount);
//		}
//		else {
//			balance-=amount;
//		}
//	}
	
	public boolean withdraw(double amount) throws InsufficientBalanceException{
		if(balance-amount>=MIN_BALANCE) {
			balance-=amount;
		}
		throw new InsufficientBalanceException(this,amount);
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
