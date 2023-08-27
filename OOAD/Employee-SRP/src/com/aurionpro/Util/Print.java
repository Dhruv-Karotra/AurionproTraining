package com.aurionpro.Util;

import com.aurionpro.model.Employee;

public class Print {
	
	public void printSalarySlip() {
		Employee emp=new Employee();
		double monthlyGrossSalary=calculateTotalSalary()/12;
		double monthlyNetSalary=monthlyGrossSalary-(monthlyGrossSalary*calculateTax()*0.01);
		System.out.println("Monthy Gross Salary : "+monthlyGrossSalary);
		System.out.println("Monthy Net Salary : "+monthlyNetSalary);
	}
}
