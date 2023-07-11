package com.aurionpro.test;

import com.aurionpro.models.Color;
import com.aurionpro.models.Border;
import com.aurionpro.models.Circle;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cr=new Circle();
		
		cr.setRadius(20);
		cr.setColor(Color.BLUE);
		cr.setBorder(Border.DASH);
		System.out.println("The radius is : "+cr.getRadius());
		System.out.println("The color is : "+cr.getColor());
		System.out.println("The width is : "+cr.getBorder());
		System.out.println("The area is : "+cr.calculateArea());
		System.out.println("The perimeter is : "+cr.calculatePerimeter());
	}

}
