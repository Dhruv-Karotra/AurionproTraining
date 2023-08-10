package com.aurionpro.test;

import com.aurionpro.model.*;

import java.util.ArrayList;
import java.util.HashSet;


public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Account> accountSet=new HashSet<>();

		accountSet.add(new Account(5, "Pankaj", 50000));
		accountSet.add(new Account(5, "Pakaj", 50000));
		accountSet.add(new Account(5, "jjj", 50000));

		accountSet.add(new Account(5, "Pankaj", 50000));
		
		System.out.println(accountSet);
		
		
	}

}
