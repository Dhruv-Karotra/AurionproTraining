package com.aurionpro.models;

public class Accountant extends Employee{
	private double hra;
	private double ma;
	
	public Accountant(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
		hra=0.25*getBasic();
		ma=0.2*getBasic();
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getMa() {
		return ma;
	}

	public void setMa(double ma) {
		this.ma = ma;
	}

	@Override
	public double calculateAnnualCTC() {
		double CTC=(hra+ma)*12;
		return CTC;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"\n"+super.toString()+"hra=" + hra + ", ma=" + ma + "\n";
	}
	
	
}
