package com.aurionpro.models;

public interface SalariedEmployee{
	
	public double calculateSalary();  
	
	//interface is blueprint of class
	//provides loose coupling-parent child dependency is less
	//program to an interface
	//methods of interface are public and abstract by default
	// interface cannot accept non-abstract methods
	//exception : from java 8 interface can contain static and default methods,i.e can have implementation
	//variables of interface are static and final by default
	//one class can implement one or more interfaces
	//an interface can extend another interface
}
