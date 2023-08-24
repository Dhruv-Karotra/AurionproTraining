package com.aurionpro.test;

import com.aurionpro.model.PrintNumber;

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("Inside main");
		System.out.println("Outside main");
		PrintNumber t1=new PrintNumber();
		t1.setName("Print1");
		t1.start();
		PrintNumber t2=new PrintNumber();
		t2.setName("Print2");
		t2.start();
		System.out.println(t2.MAX_PRIORITY);
		System.out.println(t2.MIN_PRIORITY);
		System.out.println(t2.getPriority());
		t2.setPriority(3);

	}

}
