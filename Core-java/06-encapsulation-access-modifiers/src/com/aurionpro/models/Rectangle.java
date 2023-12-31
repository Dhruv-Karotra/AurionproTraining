package com.aurionpro.models;

public class Rectangle {
	private String height;
	private String width;
	private String value;

	private double correctFieldValues(double value) {
		if (value < 1) {
			value = 1;
		} else if (value > 100) {
			value = 100;
		}
		this.value = value;
		return this.value;

	}

	public void setHeight(double height) {
		this.height = this.correctFieldValues(height);
	}

	public void setWidth(double width) {
		this.width = this.correctFieldValues(width);
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
