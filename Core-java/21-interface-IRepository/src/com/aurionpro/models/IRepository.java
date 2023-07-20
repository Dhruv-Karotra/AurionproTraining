package com.aurionpro.models;

public interface IRepository {
	
	int categories=10;   //by default is static and final
	
	void create();
	public abstract void read();
	void update();
	void delete();
	
	public default void showGreetings() {
		System.out.println("Hello from product interface");
	}
	
	public static void printWelcomeMessage() {
		System.out.println("Hello from product interface from static method");
	}
}
