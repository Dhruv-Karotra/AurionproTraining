package com.aurionpro.test;
import com.aurionpro.models.AgeCheck;
import com.aurionpro.exception.InvalidAgeException;
import java.util.Scanner;

public class ValidateAgeTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Age : ");
		int age=sc.nextInt();
		try {
			AgeCheck.validateAge(age);
		}
		catch(InvalidAgeException e){
			System.out.println(e);
		}
		
	}

}
