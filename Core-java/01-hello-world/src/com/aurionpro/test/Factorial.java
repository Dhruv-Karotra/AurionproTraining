package com.aurionpro.test;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		long factorial=1;
		if(number<0) {
			System.out.println("INVALID INPUT");
		}
		else if(number==0) {
			System.out.println("Factorial of "+number+" is : "+factorial);
		}
		else {
			for(int i=1;i<=number;i++) {
				factorial=factorial*i;
			}
			
			System.out.println("Factorial of "+number+" is : "+factorial);
		}
		
	}

}



