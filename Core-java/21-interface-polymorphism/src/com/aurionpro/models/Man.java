package com.aurionpro.models;

public class Man implements IMannerable {
	
	@Override
	public void wish() {
		System.out.println("Man wishing");
	}
	
	@Override
	public void depart() {
		System.out.println("Man departing");
	}

}
