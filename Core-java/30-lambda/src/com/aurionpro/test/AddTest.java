package com.aurionpro.test;

import com.aurionpro.model.IAddable;

public class AddTest {

	public static void main(String[] args) {
		IAddable objLambda=(number1,number2)->number1+number2;
			
		System.out.println("Using lambda : "+objLambda.addNumbers(10, 5));
		
		IAddable objSameClassFunction= AddTest::numbersAdd;  // calls numbersAdd function present in AddTest class

		System.out.println("Adding by using function in same class : "+objSameClassFunction.addNumbers(5,3));
		//here even if the function called is different but called through objSameClassFunction so it will actually call addNumbers(and not numbersAdd)
	}
	
	public static int numbersAdd(int x,int y) {
		System.out.println("Entered numerbersAdd function in AddTest class");
		return x+y;
	}
}
