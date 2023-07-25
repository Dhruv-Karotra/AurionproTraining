package com.aurionpro.models;

public class InsufficientBalanceException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private Account account;
	private double amount;
	
	public InsufficientBalanceException(Account account, double amount) {
		this.account=account;
		this.amount=amount;
	}

	@Override
	public String getMessage() {
		String message="Transaction fail\n";
		message+="Withdraw amount = "+amount;
		message+="\nAvailable balance = "+account.getBalance();
		return message;
		//return getClass().getSimpleName()+" :\t"+"Balance = "+balance+"\t Withdrawl Amount = "+amount;
	}

//	@Override
//	public String toString() {
//		return getClass().getSimpleName()+" :\t"+"Balance = "+balance+"\t Withdrawl Amount = "+amount;
//	}
	
}
