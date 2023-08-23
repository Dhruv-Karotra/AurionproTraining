package com.aurionpro.model;

import java.util.List;
import java.util.Scanner;

public class EmpControl {
	
	private EmpManage manage;
	
	public EmpControl() {
		super();
		this.manage=new EmpManage();
	}

	public void start() {
		manage.readDataToObject();
		displaymenu();
	}

	private void displaymenu() {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(choice!=-1) {
			System.out.println("Enter 1 : Add employee");
			System.out.println("Enter 2 : Delete employee");
			System.out.println("Enter 3 : Find employees in department by department ID");
			System.out.println("Enter 4 : Find immediate manager of employee");
			System.out.println("Enter 5 : Find highest paid employee in a department");
			System.out.println("Enter 6 : List all employees");
			System.out.println("Enter  7: Delete all employees");
			System.out.println("Enter -1 : Exit");
			System.out.print("Select choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				break;
//			case 2:
//				System.out.print("Enter employee id to delete employee : ");
//				int employeeId = sc.nextInt();
//				manage.deleteEmployeeByEmployeeId(employeeId);
//				manage.saveEmployeeList();
//				break;
			case 2:
			    System.out.print("Enter employee id to delete employee : ");
			    int employeeId = sc.nextInt();
			    try {
			        manage.deleteEmployeeByEmployeeId(employeeId);
//			        manage.saveEmployeeList();
			        System.out.println("Employee deleted successfully.");
			    } catch (Exception e) {
			        System.out.println("An error occurred while deleting the employee: " + e.getMessage());
			    }
			    break;
			case 3: 
				System.out.print("Enter department id to find employees : ");
				int departmentId = sc.nextInt();
				System.out.println(manage.employeesInDepartment(departmentId));
				break;
			case 4: 
				System.out.print("Enter employee id to find immediate manager : ");
				int employeeIdToFindImmediateManager = sc.nextInt();
				manage.findManagerByEmployeeID(employeeIdToFindImmediateManager);
				break;
			case 5: 
				System.out.print("Enter department id to find highest paid employee : ");
				int departmentIdToFindHighestPaidEmployee = sc.nextInt();
				manage.highestPaidEmployeeInDepartment(departmentIdToFindHighestPaidEmployee);
				break;
			case 6:
				List<Emp> employeeList=manage.getEmployees();
				if (employeeList.isEmpty())
					System.out.println("Employee list is empty");
				else
					System.out.println(employeeList);
				break;
			case 7 :
				manage.deleteAllEmployees();
				System.out.println("List cleared!");
				break;
			case -1 : 
				break;
			default: System.out.println("INVALID CHOICE");
			}
		}
		
		
	}
}
