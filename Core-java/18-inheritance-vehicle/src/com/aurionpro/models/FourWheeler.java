package com.aurionpro.models;

public class FourWheeler extends Vehicle {
	protected double mileage;

	public FourWheeler(String companyName, double mileage) {
		super(companyName);
		this.mileage = mileage;
	}
}
