package com.aurionpro.models;

public class Parent {
	private int value;

	public Parent(int value) {
		System.out.println("Parent class");
		this.value=value;
	}
	
	public Parent() {
		System.out.println("Parent class");
		this.value=0;
	}
	
}
