package com.aurionpro.models;

public class Developer extends Employee{
	
	private double PA;
	private double OT;

	public Developer(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
		PA=0.4*getBasic();
		OT=0.2*getBasic();
	}

	public double getPA() {
		return PA;
	}

	public void setPA(double pA) {
		this.PA = pA;
	}

	public double getOT() {
		return OT;
	}

	public void setOT(double oT) {
		this.OT =oT;
	}
	
	@Override
	public double calculateAnnualCTC() {
		return this.getBasic()*(PA+OT)*12;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"\n"+super.toString()+"PA=" + PA + ", OT=" + OT + "]";
	}
	
	
	
	

}
