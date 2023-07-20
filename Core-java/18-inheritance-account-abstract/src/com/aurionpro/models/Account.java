package com.aurionpro.models;

public abstract class Account {
	protected int id;
	protected String name;
	protected double balance;

	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}


	public abstract boolean withdraw(double amount);

	public boolean deposit(double amount) {
		this.balance += amount;
		return true;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
