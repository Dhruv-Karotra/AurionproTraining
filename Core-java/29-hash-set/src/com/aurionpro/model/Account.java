package com.aurionpro.model;

import java.util.HashSet;

public class Account implements Comparable<Account>{

	private int id;
	private String name;
	private double balance;
	
	public static void main(String[] args) {
		HashSet<Account> accountSet=new HashSet<>();

		accountSet.add(new Account(1, "Dhruv", 10000));
		accountSet.add(new Account(2, "Raj", 20000));
		accountSet.add(new Account(3, "Gautam", 30000));
		accountSet.add(new Account(4, "Nikul", 40000));
		accountSet.add(new Account(5, "Pankaj", 50000));
		accountSet.add(new Account(5, "Pankaj", 50000));
		
		System.out.println(accountSet);
	}
	
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
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

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Account o) {
		return (int)(balance-o.balance);
	//  return name.compareTo(o.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	
	
	

}
