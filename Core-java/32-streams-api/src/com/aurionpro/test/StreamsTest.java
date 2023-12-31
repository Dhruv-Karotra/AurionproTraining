package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.jws.soap.SOAPBinding;

import org.omg.Messaging.SyncScopeHelper;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;
import com.aurionpro.model.Gender;

public class StreamsTest {

	public static void main(String[] args) {
		//Stream<Integer> intStream=Stream.of(10,20,30,40,50);
		
		String[] names= {"Susminder","Jigna","Bhabhi","Nikul","Pankaj"};
		
//		List<String> fiveCharNames=new ArrayList<String>();
//		
//		for(String x : names) {
//			if(x.length()==5) {
//				fiveCharNames.add(x);
//			}
//		}
//		
//		for(String x : fiveCharNames){
//			System.out.println(x);
//		}
		
		List<String> collectNames = Arrays.stream(names)
									.filter((name)->(name.length()==5)) // predicate logic should be inside filter()
								    .collect(Collectors.toList());

		collectNames.stream().forEach((name)->System.out.println(name));
		
	List<Account> accounts= Arrays.asList(new Account(1,"Laxman",5000,Gender.MALE,AccountType.SAVINGS),
			new Account(2,"Jigna",50000,Gender.FEMALE,AccountType.CURRENT),
			new Account(3,"Dhruv",10000,Gender.MALE,AccountType.SAVINGS),
			new Account(4,"Susminder",2000,Gender.MALE,AccountType.SAVINGS),
			new Account(5,"Rajesh",15000,Gender.MALE,AccountType.SAVINGS),
			new Account(6,"Pankaj",40000,Gender.MALE,AccountType.SAVINGS),
			new Account(7,"Tisha",70000,Gender.FEMALE,AccountType.CURRENT),
			new Account(8,"Nikul",60000,Gender.MALE,AccountType.CURRENT),
			new Account(9,"Kalavanti",65000,Gender.FEMALE,AccountType.SAVINGS),
			new Account(10,"Kishan",55000,Gender.MALE,AccountType.CURRENT));
		
//		Stream<Account> account=Arrays.stream(accounts);
//		account.forEach((x)->System.out.println(x));
		
		System.out.println("Current Accounts : ");
		List<Account> currentAccounts=accounts.stream()
				.filter((acc)->acc.getAccountType()==AccountType.CURRENT) //predicate logic should be inside filter()
				.collect(Collectors.toList());  //collect() is terminal operation and Collectors.toList() returns a list
		currentAccounts.stream().forEach((acc)->System.out.println(acc));	
		
		System.out.println("Female Account Holders : ");
		List<Account> femaleAccountHolders=accounts.stream()
				.filter((acc)->acc.getGender()==Gender.FEMALE) //predicate logic should be inside filter()
				.collect(Collectors.toList());  //collect() is terminal operation and Collectors.toList() returns a list
		femaleAccountHolders.stream().forEach((acc)->System.out.println(acc));	
		
		System.out.println("Accounts with balance>50000 : ");
		List<Account> highBalanceAccounts=accounts.stream()
				.filter((acc)->acc.getBalance()>=50000) //predicate logic should be inside filter()
				.collect(Collectors.toList());  //collect() is terminal operation and Collectors.toList() returns a list
		highBalanceAccounts.stream().forEach((acc)->System.out.println(acc));	
		highBalanceAccounts.forEach(System.out::println);
		
		System.out.println("Balance List of all accounts : ");
		List<Double> balanceListOfAllAccounts = accounts.stream()
		.map((account)->account.getBalance())   //function logic should be inside map()
		.collect(Collectors.toList());
		balanceListOfAllAccounts.forEach(System.out::println);
		
		System.out.println("Sorted Balance List - 3 highest balance");
		List<Account> sortedBalanceList = accounts.stream()
		.sorted(Comparator.comparingDouble(Account::getBalance).reversed()).limit(3)
		.collect(Collectors.toList());
	sortedBalanceList.forEach(System.out::println);
		
		
		

	}

}
