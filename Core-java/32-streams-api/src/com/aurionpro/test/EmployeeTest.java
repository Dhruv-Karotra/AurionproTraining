package com.aurionpro.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

import com.aurionpro.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		
		List<Employee> employeeList=Arrays.asList(new Employee(1,"Dhruv","Cash Management",30000),
				new Employee(2,"Jigna","Human resource",40000),
				new Employee(3,"Nikul","Revenue Management",70000),
				new Employee(4,"Pankaj","Human Resource",20000),
				new Employee(5,"Rajesh","Revenue Management",90000));
		
		Map<String, List<Employee>> employeeOfRevenueManagement = employeeList.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment));   // Biconsumer logic should be inside groupingBy()

		//System.out.println(employeeOfRevenueManagement);
		employeeOfRevenueManagement.forEach((key,value)->{
			System.out.println(key+"\t"+value);
		});
		
		Double totalSalary = employeeList.stream()
				.map((emp)->emp.getSalary())
				.reduce(0.0,(a,b)->a+b); 
		
		System.out.println("Total salary of all employees : "+totalSalary);
		
		//count is a terminal operation
		// filereader stream
		//create file with 5 streams
	}

}
