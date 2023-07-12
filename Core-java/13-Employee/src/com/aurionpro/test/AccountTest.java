package com.aurionpro.test;

import com.aurionpro.models.Account;
import com.aurionpro.models.AccountType;

import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		/*Account[] acc=new Account[10];
		for(int i=0;i<acc.length;i++) {
			System.out.println("Enter values for "+(i+1)+" account : ");
			acc[i]=new Account();
			setAccountValues(acc[i]);
		}
		
		for(int i=0;i<acc.length;i++) {
			System.out.println("The details for "+(i+1)+" account : ");
			printAccountDetails(acc[i]);
		}*/
		Account[] acc={
			new Account(1,"Dhruv",10000,AccountType.SAVINGS),
			new Account(2,"Aniket",20000,AccountType.CURRENT),
			new Account(3,"Suswar",30000,AccountType.SAVINGS),
			new Account(4,"Raj",50000,AccountType.CURRENT),
			new Account(5,"Gautam",2000,AccountType.SAVINGS),
			new Account(6,"Harshal",5000,AccountType.CURRENT),
			new Account(7,"Shashwat",1000,AccountType.SAVINGS),
			new Account(8,"Brijesh",100000,AccountType.CURRENT),
			new Account(9,"Nikul",8000,AccountType.SAVINGS),
			new Account(10,"Rajesh",70000,AccountType.CURRENT)
		};
		
		for(Account x:acc) {
			System.out.println(x);
		}
		
		Account highestBalanceAccount=findHighestBalanceAccount(acc);
		System.out.println("Account with highest balance : "+highestBalanceAccount);
		
		Account highestSavingsBalanceAccount=findHighestBalanceAccountFromType(acc,AccountType.SAVINGS);
		System.out.println("Highest savings balance account : "+highestSavingsBalanceAccount);
		
		Account highestCurrentBalanceAccount=findHighestBalanceAccountFromType(acc,AccountType.CURRENT);
		System.out.println("Highest current balance account : "+highestCurrentBalanceAccount);
		
		double sumOfAllAccounts=findSumOfAllAccounts(acc);
		System.out.println("Sum of all accounts : "+sumOfAllAccounts);
		
		double sumOfAllSavingsAccounts=findSumOfAllAccountsType(acc,AccountType.SAVINGS);
		System.out.println("Sum of all accounts : "+sumOfAllSavingsAccounts);
		
		double sumOfAllCurrentAccounts=findSumOfAllAccountsType(acc,AccountType.CURRENT);
		System.out.println("Sum of all accounts : "+sumOfAllCurrentAccounts);
		
		System.out.println("SORTING ACCOUNTS IN ASCENDING ORDER OF SALARY : ");
		sortAccountsArrayBySalary(acc);
		for(Account x:acc) {
			System.out.println(x);
		}	
	}
	
	private static Account findHighestBalanceAccount(Account[] acc) {
		Account maxBalance=acc[0];
		for(int i=0;i<acc.length;i++) {
			if(acc[i].getBalance()>maxBalance.getBalance()) {
				maxBalance=acc[i];
			}
		}
		return maxBalance;
	}
	
	private static Account findHighestBalanceAccountFromType(Account[] acc,AccountType accountType) {
		Account maxAccount=null;
		
		for(int i=0;i<acc.length;i++){
			if(maxAccount==null && acc[i].getAccountType().equals(accountType)) {
				maxAccount=acc[i];
			}
			
			if(maxAccount!=null) {
				if(acc[i].getAccountType().equals(accountType) && acc[i].getBalance()>maxAccount.getBalance()) {
					maxAccount=acc[i];
				}
			}
		}
		return maxAccount;
	}
	
	private static double findSumOfAllAccounts(Account[] acc) {
		double sum=0;
		for(int i=0;i<acc.length;i++) {
			sum+=acc[i].getBalance();
		}
		return sum;
	}
	
	private static double findSumOfAllAccountsType(Account[] acc, AccountType accountType) {
		double sum=0;
		for(int i=0;i<acc.length;i++) {
			if(acc[i].getAccountType().equals(accountType)) {
				sum+=acc[i].getBalance();
			}
		}
		return sum;
	}
	
	
	private static void sortAccountsArrayBySalary(Account[] acc) {
		Account temp=null;
		for(int i=0;i<acc.length;i++) {
			for(int j=0;j<acc.length-1;j++) {
				if(acc[i].getBalance()<acc[j].getBalance()) {
					temp=acc[i];
					acc[i]=acc[j];
					acc[j]=temp;
				}
			}
		}
	}
	
	

	
	/*public static void setAccountValues(Account acc) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the id : ");
		int id=sc.nextInt();
		System.out.print("Enter the name : ");
		String name=sc.next();
		System.out.print("Enter the balance : ");
		double balance=sc.nextDouble();
		
		acc.setId(id);
		acc.setName(name);
		acc.setBalance(balance);
		
		try {
			System.out.print("Enter the account type : ");
			AccountType accountType=AccountType.valueOf(sc.next().toUpperCase());
			acc.setAccountType(accountType);
		}catch(IllegalArgumentException e){
			
			acc.setAccountType(AccountType.SAVINGS);
		}
		
	}
	
	public static void printAccountDetails(Account acc) {
		System.out.println("The ID is : "+acc.getId());
		System.out.println("The name is : "+acc.getName());
		System.out.println("The balance is : "+acc.getBalance());
		System.out.println("The Account Type is : "+acc.getAccountType());
	}*/
	
	

}
