package com.aurionpro.models;

import com.aurionpro.models.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle();
		rectangle.setHeight(20);
		rectangle.setWidth(20);
		rectangle.setColor("WHITE");
		System.out.println("The height is : "+rectangle.getHeight());
		System.out.println("The width is : "+rectangle.getWidth());
		System.out.println("The area is : "+rectangle.calculateArea());
		System.out.println("The color is : "+rectangle.getColor());
	}

}
