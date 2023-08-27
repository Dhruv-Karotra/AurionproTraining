package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.PrinterUtil;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1=new Employee(101, "Ajay", 100000);
		Employee employee2=new Employee(102, "Dhruv", 10000);
		new PrinterUtil().printSalarySlip(employee1);
	}

}
