package com.aurionpro.test;

import com.aurionpro.models.Color;
import com.aurionpro.models.Rectangle;
import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1=new Rectangle(20,10,Color.GREEN); //calling parameterized constructor
		printRectangleDetails(rectangle1);
		System.out.println("**************************");
		Rectangle rectangle2=new Rectangle();                //calling unparameterized constructor
		printRectangleDetails(rectangle2);
	}	
	
	public static void setRectangleValues(Rectangle r) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the height : ");
		double height=sc.nextDouble();
		System.out.print("Enter the width : ");
		double width=sc.nextDouble();
		System.out.print("Enter the color : ");
		
		r.setHeight(height);
		r.setWidth(width);

		try {
			Color color=Color.valueOf(sc.next().toUpperCase());
			r.setColor(color);
		}
		catch(IllegalArgumentException e) {
			r.setColor(Color.RED);
		}
	}
	
	public static void printRectangleDetails(Rectangle r) {
		System.out.println("The height is : "+r.getHeight());
		System.out.println("The width is : "+r.getWidth());
		System.out.println("The area is : "+r.calculateArea());
		System.out.println("The color is : "+r.getColor());
	}
}
