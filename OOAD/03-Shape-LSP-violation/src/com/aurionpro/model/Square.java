package com.aurionpro.model;

public class Square extends Rectangle{

	public Square(int side) {
		super(side,side);
	}
	
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}
}
