package com.aurionpro.test;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.aurionpro.model.IAddable;
import com.aurionpro.model.IGreetable;
import com.aurionpro.model.WelcomeGreeting;

public class LambdaTest {
	

	public LambdaTest() {
		super();
		System.out.println("Inside Constructor");
	}

	public static void main(String[] args) {
		
		IGreetable obj=new WelcomeGreeting();
		obj.printGreeting();
		
		IGreetable objGoodDay=new IGreetable() {	
			@Override
			public void printGreeting() {
				System.out.println("hello Good Day!");
			}
		};
		objGoodDay.printGreeting();
		
		IGreetable objBye=new IGreetable() {
			@Override
			public void printGreeting() {
				System.out.println("Hello bye!!");
				
			}
		};
		objBye.printGreeting();
		
		// to use lambda the interface should be a functional interface
		// functional interface is the interface which has only one abstract method
		// if there are more than 1 abstract methods 
		IGreetable objByeLambda =()->{	
				System.out.println("Hello bye is in Anonymous!!!");
				System.out.println("Hello bye is in Anonymous!!!");
		};
		
		objByeLambda.printGreeting();
		
		IGreetable objByeLambdaOneLine=()-> System.out.println("Bye anonymous in one line");
		objByeLambdaOneLine.printGreeting();
		
		IGreetable objConstructor= LambdaTest::new;
		objConstructor.printGreeting();  // here calls constructor LambdaTest() and not printGreeting()
		
		System.out.println("---------------------");
		
		IAddable objLambda=(number1,number2)->number1+number2;
		
		System.out.println("Using lambda : "+objLambda.addNumbers(10, 5));
		
		IAddable objSameClassFunction= LambdaTest::numbersAdd;  // calls numbersAdd function present in AddTest class

		
		
		System.out.println("Adding by using function in same class : "+objSameClassFunction.addNumbers(5,3));
		//here even if the function called is different but called through objSameClassFunction so it will actually call addNumbers(and not numbersAdd)
		
		System.out.println("---------------------");
		
		Consumer<String> consumerObj=(name)-> System.out.println(name);
		consumerObj.accept("ABCDDDDD");
		
		Function<String,String> functionObj=(name)->{ 
			return name.toLowerCase();
		};
		System.out.println(functionObj.apply("Susminder"));
		
		Predicate<String> predicateObj=(name)->{
			return name.length()>=10;
		};
		System.out.println(predicateObj.test("Dhruvvvvvvvvv"));
		
		BiFunction<Integer,Integer,Integer> biFunctionObj=(firstNumber,secondNumber)->{
			return firstNumber+secondNumber;
		};
		System.out.println(biFunctionObj.apply(100,7));
		
		BiPredicate<String,String> biPredicateObj=(firstName,secondName)->{
			return firstName==secondName;
		};
		System.out.println(biPredicateObj.test("Dhruv","Dhruv"));
		
	}

	public static int numbersAdd(int x,int y) {   // this method definition should be same as the abstract method
		System.out.println("Entered numbersAdd() function in LambdaTest class");
		return x+y;
	}

}
