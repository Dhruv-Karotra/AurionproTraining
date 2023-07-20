package com.aurionpro.models;
import com.aurionpro.exception.InvalidAgeException;

public class AgeCheck {
	
	public static void validateAge(int age){
		if(age>18) {
			System.out.println("valid");
		}else {
			throw new InvalidAgeException("Invalid Age");		
			}
	}
}

