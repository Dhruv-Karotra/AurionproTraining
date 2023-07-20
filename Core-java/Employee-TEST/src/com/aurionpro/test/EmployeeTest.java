package com.aurionpro.test;

import com.aurionpro.models.*;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp= new Manager(1,"Gautam",10000);	
		printSalarySlip(emp);

		

	}
	private static void printSalarySlip(Employee emp) {
		System.out.println(emp.toString());
		System.out.println("CTC = "+emp.calculateAnnualCTC());
		//System.out.println("Monthly salary = "+emp.calculateAnnualCTC()/12);
	}
	


}
