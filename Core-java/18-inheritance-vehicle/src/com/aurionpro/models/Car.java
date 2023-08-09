package com.aurionpro.models;

public class Car extends FourWheeler {
	private double price;
	private String model;

	public Car(String companyName, double mileage, String model, double price) {
		super(companyName, mileage);
		this.price = price;
		this.model = model;
	}

	public void showCarDetails() {
		System.out.println("Company Name : " + companyName);
		System.out.println("Mileage : " + mileage);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
	}
}
