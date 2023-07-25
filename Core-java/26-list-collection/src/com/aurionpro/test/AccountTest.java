package com.aurionpro.test;

import com.aurionpro.model.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();

		accounts.add(new Account(1, "Dhruv", 10000));
		accounts.add(new Account(2, "Raj", 20000));
		accounts.add(new Account(3, "Gautam", 30000));
		accounts.add(new Account(4, "Nikul", 40000));
		accounts.add(new Account(5, "Pankaj", 50000));
		
		List<Account> highBalanceAccount=new ArrayList<Account>();
		for (Account x : accounts) {
			if(x.getBalance()>=30000) {
				highBalanceAccount.add(x);
			}
		}
		System.out.println("-------------------------------");
		System.out.println("High balance account  ");
		System.out.println(highBalanceAccount);
		System.out.println("-------------------------------");


		System.out.println(accounts);
		System.out.println("--------------------------------");

		for (Account x : accounts) {
			System.out.println(x);
		}
		System.out.println("---------------------------------");

		Iterator<Account> iterator = accounts.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getBalance());
		}
		
		accounts.forEach((x)->{
			System.out.println(x.getBalance());
		});
		
		accounts.forEach(System.out::println);
		
		Collections.sort(accounts);
	//  Collections.sort(accounts,Collections.reverseOrder());
		
		System.out.println(accounts);
		
		
	}

}
