package com.aurionpro.models;

import java.time.LocalDate;

public class Bus extends Vehicle implements IMovable{
	
	
	public Bus(String model, LocalDate dom) {
		super(model, dom);
	}

	@Override
	public String toString() {
		return "Bus\n" + super.toString() + "]";
	}

	@Override
	public void showTopSpeed() {
		System.out.println("Top Speed : 80"); 
	}
	
	@Override
	public void move() {
		System.out.println("Car moving");
	}
}
