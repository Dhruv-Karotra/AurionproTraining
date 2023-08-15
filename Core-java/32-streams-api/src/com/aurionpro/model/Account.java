package com.aurionpro.model;
import com.aurionpro.model.Gender;
import com.aurionpro.model.AccountType;

public class Account implements Comparable<Account>{

	private int id;
	private String name;
	private double balance;
	private Gender gender;
	private AccountType accountType;

	public Account(int id, String name, double balance, Gender gender,AccountType accountType) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.gender=gender;
		this.accountType=accountType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Account o) {
		return (int)(balance-o.balance);
	//  return name.compareTo(o.name);
	}

}
