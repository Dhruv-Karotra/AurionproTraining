package com.aurionpro.models;

import java.io.Serializable;

public class Account implements Serializable {
	protected int id;
	protected String name;
	protected double balance;

	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}


	public boolean withdraw(double amount) {
		this.balance -= amount;
		return true;
	}

	public boolean deposit(double amount) {
		this.balance += amount;
		return true;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
