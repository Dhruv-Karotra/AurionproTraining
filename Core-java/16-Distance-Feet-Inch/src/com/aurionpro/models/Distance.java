package com.aurionpro.models;

public class Distance {
	private double Feet;
	private double Inch;
	public Distance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getFeet() {
		return Feet;
	}
	public void setFeet(double feet) {
		Feet = feet;
	}
	public double getInch() {
		return Inch;
	}
	public void setInch(double inch) {
		Inch = inch;
	}
	
	
	private Distance addDistance(Distance d) {
		Distance addedDistance=new Distance();
		if(this.getInch()+d.getInch()>12) {
			addedDistance.setInch(this.getInch()+d.getInch())%12;
		}
		;
		return addedDistance;
	}

	


	
	

}
