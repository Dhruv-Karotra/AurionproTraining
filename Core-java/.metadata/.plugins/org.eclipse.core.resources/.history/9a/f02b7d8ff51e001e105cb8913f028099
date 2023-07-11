package com.aurionpro.models;

public class Rectangle {
	private double height;
	private double width;
	private String color="";


	private double correctFieldValues(double value) {
		if (value < 1) {
			value = 1;
		} else if (value > 100) {
			value = 100;
		}
		return value;
	}
	
	private String correctColor(String c) {
		if (c.equalsIgnoreCase("red") || c.equalsIgnoreCase("blue") || c.equalsIgnoreCase("green")) {
			color = c;
		} else{
			color = "red";
		}
		return color;
	}
	
	public void setColor(String color) {
		this.color = correctColor(color);
	}
	
	public String getColor() {
		return color;
	}

	public void setHeight(double height) {
		this.height = correctFieldValues(height);
	}

	public void setWidth(double width) {
		this.width = correctFieldValues(width);
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double calculateArea() {
		return this.height * this.width;
	}

}
