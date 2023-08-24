package com.aurionpro.test;

import com.aurionpro.model.Table;

public class ThreadTableTest {

	public static void main(String[] args) {
		Table tableObj = new Table(5);
		Thread t1 = new Thread(tableObj);
		t1.start();

		Table tableObj2 = new Table(2);
		Thread t2 = new Thread(tableObj2);
		t2.start();
		
//		int number=7;
//		for (int i = 1; i <= 10; i++) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println( number+ " * " + i + " = " +number*i);
//		}

	}

}
