package com.aurionpro.test;

import com.aurionpro.Util.Print;
import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee(1,"Jigna",100000);
		Print print=new Print();
		print.printSalarySlip();
		

	}

}
