package com.aurionpro.Util;

import com.aurionpro.model.Employee;
public class TaxUtil {
	public double calculateTax(Employee emp) {
		double annualSalary=emp.get;
		if(emp.calculateTotalSalary()>500000 && emp.calculateTotalSalary()<800000)
			tax=10;
		else if(emp.calculateTotalSalary()>800000 && emp.calculateTotalSalary()<100000)
			tax=20;
		else if(emp.calculateTotalSalary()>1000000)
			tax=30;
		return tax;
	}
}
