package com.aurionpro.models;

public class SavingAccount extends Account {

	public SavingAccount(int id, String name, double balance) {
		super(id, name, balance);
		// TODO Auto-generated constructor stub
	}

	private static final int MIN_BALANCE = 1000;

	@Override
	public boolean withdraw(double amount) {
		if (this.getBalance() - amount < MIN_BALANCE) {
			return false;
		}
		this.setBalance(this.getBalance() - amount);
		return true;
	}

}
