package com.aurionpro.test;

public class UncheckedExceptionTest {

	public static void main(String[] args) {
		System.out.println("main start");
		function1();
		System.out.println("main end");
	}

	private static void function1() {
		System.out.println("start f1");
		//try {
			function2();
		//} catch(Exception e) {
			//e.printStackTrace();
			System.out.println("end f1");
		//}
	}

	private static void function2() {
		System.out.println("start f2");
		try {
			function3();
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("end f2");
		}
	}

	private static void function3() {
		System.out.println("start f3");
		function4();
		System.out.println("end f3");
		
	}

	private static void function4() {
		System.out.println("start f4");
		throw new RuntimeException();
	}

}
