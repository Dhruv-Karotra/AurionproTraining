package com.aurionpro.models;

public class Boy extends Man{
	
	public void eat() {
		System.out.println("Boy eating");
	}
	
	@Override
	public void read() {
		System.out.println("Boy reading");
	}

}
