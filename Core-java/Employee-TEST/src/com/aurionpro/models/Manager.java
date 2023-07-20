package com.aurionpro.models;

public class Manager extends Employee{
	
	private double hra;
	private double da;
	private double ta;
	
	public Manager(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
		hra=0.25*basic;
		da=0.15*basic;
		ta=0.1*basic;
	}
	
	
	public double getHra() {
		return hra;
	}


	public void setHra(double hra) {
		this.hra = hra;
	}


	public double getDa() {
		return da;
	}


	public void setDa(double da) {
		this.da = da;
	}


	public double getTa() {
		return ta;
	}


	public void setTa(double ta) {
		this.ta = ta;
	}


	@Override
	public double calculateAnnualCTC() {
		return (this.getBasic()+(hra+da+ta))*12;
	}


	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"\n"+super.toString()+"hra=" + hra + ", da=" + da + ", ta=" + ta + "]";
	}
	
	
	
}
