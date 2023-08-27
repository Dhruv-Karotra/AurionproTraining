package com.aurionpro.test;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee=new Employee(101, "Ajay", 100000);
		employee.printSalarySlip();
	}

}
