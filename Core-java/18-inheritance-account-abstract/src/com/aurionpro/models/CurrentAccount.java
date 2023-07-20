package com.aurionpro.models;

public class CurrentAccount extends Account {

	public CurrentAccount(int id, String name, double balance) {
		super(id, name, balance);
	}

	private static final int OVER_DRAFT = -25000;

	@Override
	public boolean withdraw(double amount) {
		if (this.balance - amount < OVER_DRAFT) {
			return false;
		}
		this.balance-= amount;
		return true;
	}


}
