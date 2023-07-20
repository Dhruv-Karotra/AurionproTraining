package com.aurionpro.models;

import java.time.LocalDate;

public class Car extends Vehicle implements IMovable{
	public Car(String model, LocalDate dom) {
		super(model, dom);
	}
	
	@Override
	public String toString() {
		return "Car\n"+ super.toString()+ "]";
		//return "Professor\n"+super.toString()+"\tsalary=" + salary + "]";
	}

	@Override
	public void showTopSpeed() {
		System.out.println("Top Speed : 120"); 
	}
	
	@Override
	public void move() {
		System.out.println("Car moving");
	}
}
