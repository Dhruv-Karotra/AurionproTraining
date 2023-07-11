package com.aurionpro.models;

public class Circle {
	private double radius;
	private Color color;
	private Border border;


//	private double correctFieldValues(double value) {
//		if (value < 1) {
//			value = 1;
//		} else if (value > 100) {
//			value = 100;
//		}
//		return value;
//	}
	
//	private String correctColor(String c) {
//		if (c.equalsIgnoreCase("red") || c.equalsIgnoreCase("blue") || c.equalsIgnoreCase("green")) {
//			color = c;
//		} else{
//			color = "red";
//		}
//		return color;
//	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setColor(Color color) {
		this.color =color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setBorder(Border border) {
		this.border =border;
	}
	
	public Border getBorder() {
		return border;
	}

	public double calculateArea() {
		return Math.PI*Math.pow(this.radius, 2);
	}
	
	public double calculatePerimeter() {
		return 2*Math.PI*this.radius;
	}


}
