package com.aurionpro.test;

import com.aurionpro.models.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle();
		rectangle.height=12;
		rectangle.width=5;
		double area = rectangle.areaRectangle();
		System.out.println("Area of the rectangle is = "+area);
		
		Rectangle rectangle2=new Rectangle();
		rectangle2.height=12;
		rectangle2.width=3;
		double area2 = rectangle2.areaRectangle();
		System.out.println("Area of the rectangle is = "+area2);
	}

}
