package com.aurionpro.models;

public class CurrentAccount extends Account {

	public CurrentAccount(int id, String name, double balance) {
		super(id, name, balance);
	}

	private static final int OVER_DRAFT = -25000;

	@Override
	public boolean withdraw(double amount) {
		double balance = getBalance();
		if (balance - amount < OVER_DRAFT) {
			return false;
		}
		this.setBalance(this.getBalance() - amount);
		return true;
	}

}
