package com.aurionpro.test;

import com.aurionpro.model.IGreetable;
import com.aurionpro.model.WelcomeGreeting;

public class LambdaTest {

	public static void main(String[] args) {
		
		IGreetable obj=new WelcomeGreeting();
		obj.showGreeting();
		
		IGreetable objGoodDay=new IGreetable() {	
			@Override
			public void showGreeting() {
				System.out.println("hello Good Day!");
			}
		};
		objGoodDay.showGreeting();
		
		IGreetable objBye=new IGreetable() {
			@Override
			public void showGreeting() {
				System.out.println("Hello bye!!");
				
			}
		};
		objBye.showGreeting();
		
		// to use lambda the interface should be a functional interface
		// functional interface is the interface which has only one abstract method
		// if there are more than 1 abstract methods 
		IGreetable objByeLambda =()->{	
				System.out.println("Hello bye is in Anonymous!!!");
				System.out.println("Hello bye is in Anonymous!!!");
		};
		
		objByeLambda.showGreeting();
		
		IGreetable objByeLambdaOneLine=()-> System.out.println("Bye anonymous in one line");
		objByeLambdaOneLine.showGreeting();


	}

}
