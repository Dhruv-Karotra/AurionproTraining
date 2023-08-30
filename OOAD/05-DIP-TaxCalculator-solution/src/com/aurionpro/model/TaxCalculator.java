package com.aurionpro.model;
public class TaxCalculator {
	private ILogger iLogger;

	public TaxCalculator(ILogger iLogger) {
		this.iLogger = iLogger;
	}
	public TaxCalculator() {
		super();
	}

	public int calculateTax(int amount, int rate) {
		int tax=0;
		try {
			tax=amount/rate;
			System.out.println("Tax : "+tax);
		}catch(Exception e) {
			new DBLogger().log("Divide by zero");
		}
		
		
		return tax;
	}
}
