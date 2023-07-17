package com.aurionpro.test;

import com.aurionpro.models.*;

public class InheritanceTest {

	public static void main(String[] args) {
		case1();
		System.out.println("------------------");
		case2();
		System.out.println("------------------");
		case3();
		System.out.println("------------------");
		case4();
		System.out.println("------------------");
		case5();
		
		Object obj;
		obj=10;
		System.out.println(obj.getClass().getSimpleName());
		obj="hiii";
		System.out.println(obj.getClass().getSimpleName());
		obj=10<20;
		System.out.println(obj.getClass().getSimpleName());

	}
	
	private static void case1() {
		Man man=new Man();
		man.read();
		man.play();
	}
	
	private static void case2() {
		Boy boy=new Boy();
		boy.eat();
		boy.read();
		boy.play();
	}
	
	private static void case3() {
		Kid kid=new Kid();
		kid.play();
	}
	
	private static void case4() {
		Man man=new InFant();
		//man.sleep();  
		man.play();
		man.read();
	}
	
	private static void case5() {
		playAtPark(new Man());
		playAtPark(new Boy());
		playAtPark(new Kid());
		playAtPark(new InFant());
	}
	
	private static void playAtPark(Man man) {
		System.out.println("At the park ..");
		man.play();
	}
	
	private static void case6() {
		typeCastObject(new InFant());
	}
	
	private static void typeCastObject(Man man) {
		if(man instanceof InFant) {
			InFant infant=(InFant)man;
			infant.sleep();
			
		}
	}
	

}
