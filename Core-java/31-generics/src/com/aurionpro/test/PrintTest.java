package com.aurionpro.test;

import com.aurionpro.model.PrintValue;
import com.aurionpro.model.Rectangle;

public class PrintTest {

	public static void main(String[] args) {
		PrintValue<Integer> obj=new PrintValue<Integer>(10);
		obj.print();
		
		PrintValue<String> obj2=new PrintValue<String>("Jigna");  // if T extends Number then this will give error
		obj2.print();
		
		PrintValue<Float> obj3=new PrintValue<Float>(10.3f);
		obj3.print();
		
		PrintValue<Double> obj4=new PrintValue<Double>(10.33);
		obj4.print();
		
		PrintValue<Rectangle> obj5=new PrintValue<Rectangle>(new Rectangle(10,5));   //if T extends Number then this will give error
		obj5.print();
		
		PrintTest objPrintTest= new PrintTest();
		objPrintTest.printValues("Susminder",20);
		objPrintTest.printValues("Andya","Kandya");
		objPrintTest.printValues(40f,20);

	}
	
	private static <T1,T2> void printValues(T1 value1,T2 value2) {
		System.out.println(value1+"\t"+value2);
	}

}
