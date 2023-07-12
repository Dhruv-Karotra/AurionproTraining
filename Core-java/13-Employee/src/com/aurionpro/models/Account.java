package com.aurionpro.models;

public class Account {
	private int id;
	private String name;
	private double balance;
	private AccountType accountType;
	
	public Account(int id, String name, double balance, AccountType accountType) {
		super();
		this.id=id;
		this.name=name;
		this.balance=balance;
		this.accountType=accountType;
	}
	
	public Account() {
		this.id=0;
		this.name="Dhruv";
		this.balance=10000.0;
		this.accountType=AccountType.SAVINGS;
	}
	
	public void setAccountType(AccountType accountType) {
		this.accountType=accountType;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", accountType=" + accountType + "]";
	}
}
