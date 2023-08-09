package com.aurionpro.test;
import com.aurionpro.models.*;

import java.util.Scanner;

public class VehicleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of cars : ");
		int n = sc.nextInt();
		Car[] c = new Car[n];
		setCarDetails(c);
		for (int i = 0; i < n; i++) {
			System.out.println("CAR " + (i + 1) + " : ");
			c[i].showCarDetails();
		}
	}

	private static void setCarDetails(Car[] c) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < c.length; i++) {
			System.out.println("CAR " + (i + 1) + " : ");
			System.out.println("Enter company name : ");
			String companyName = sc.next();
			System.out.println("Enter mileage : ");
			double mileage = sc.nextDouble();
			System.out.println("Enter model : ");
			String model = sc.next();
			System.out.println("Enter price : ");
			double price = sc.nextDouble();

			c[i] = new Car(companyName, mileage, model, price);
		}
	}

}
