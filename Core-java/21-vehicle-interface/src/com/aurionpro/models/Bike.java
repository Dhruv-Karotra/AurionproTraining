package com.aurionpro.models;

import java.time.LocalDate;

public class Bike extends Vehicle implements IMovable {
	public Bike(String model, LocalDate dom) {
		super(model, dom);
	}

	@Override
	public String toString() {
		return "Bike\n" + super.toString() + "]";
	}

	@Override
	public void showTopSpeed() {
		System.out.println("Top Speed : 100"); 
	}
	
	@Override
	public void move() {
		System.out.println("Car moving");
	}
}
