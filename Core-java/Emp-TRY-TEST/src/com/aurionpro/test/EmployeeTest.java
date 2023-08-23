package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import com.aurionpro.model.Employee;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EmployeeTest {

	private static final String filepath = "D:\\emp.txt";
	private List<Employee> employees = new ArrayList<>();

	public void saveEmployeesToFile() {
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filepath))) {
			outputStream.writeObject(employees);
			System.out.println("Employees saved to file.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error saving employees to file: " + e.getMessage());
		}
	}

	public void loadEmployeesFromFile() {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filepath))) {
			employees = (List<Employee>) inputStream.readObject();
			System.out.println("Employees loaded from file.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error loading employees from file: " + e.getMessage());
		}
	}

	public List<Employee> findEmployeesInDepartment(int departmentNo) {
		List<Employee> employeesInDepartment = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee.getDepartmentNo() == departmentNo) {
				employeesInDepartment.add(employee);
			}
		}
		return employeesInDepartment;
	}

	public Map<Integer, Integer> countEmployeesPerDepartment() {
		Map<Integer, Integer> departmentEmployeeCount = new HashMap<>();
		for (Employee employee : employees) {
			int departmentNo = employee.getDepartmentNo();
			departmentEmployeeCount.put(departmentNo, departmentEmployeeCount.getOrDefault(departmentNo, 0) + 1);
		}
		return departmentEmployeeCount;
	}

	public Employee findImmediateManager(int employeeID) {
		for (Employee employee : employees) {
			if (employee.getEmployeeID() == employeeID) {
				int managerID = employee.getManagerId();
				for (Employee manager : employees) {
					if (manager.getEmployeeID() == managerID) {
						return manager;
					}
				}
				break;
			}
		}
		return null;
	}

	public Map<Integer, Employee> findHighestPaidInEachDepartment() {
		Map<Integer, Employee> highestPaidPerDepartment = new HashMap<>();
		for (Employee employee : employees) {
			int departmentNo = employee.getDepartmentNo();
			if (!highestPaidPerDepartment.containsKey(departmentNo)
					|| employee.getSalary() > highestPaidPerDepartment.get(departmentNo).getSalary()) {
				highestPaidPerDepartment.put(departmentNo, employee);
			}
		}
		return highestPaidPerDepartment;
	}

	public Map<String, Employee> findHighestPaidInEachRole() {
		Map<String, Employee> highestPaidPerRole = new HashMap<>();
		for (Employee employee : employees) {
			String job = employee.getJob();
			if (!highestPaidPerRole.containsKey(job)
					|| employee.getSalary() > highestPaidPerRole.get(job).getSalary()) {
				highestPaidPerRole.put(job, employee);
			}
		}
		return highestPaidPerRole;
	}

	public List<Employee> findEmployeesJoinedBetweenDates(Date startDate, Date endDate) {
		List<Employee> employeesJoinedBetweenDates = new ArrayList<>();
		for (Employee employee : employees) {
			Date joiningDate = employee.getJoiningDate();
			if (joiningDate.after(startDate) && joiningDate.before(endDate)) {
				employeesJoinedBetweenDates.add(employee);
			}
		}
		return employeesJoinedBetweenDates;
	}

	public Employee findSalesmanWithHighestCommission() {
		Employee highestCommissionSalesman = null;
		for (Employee employee : employees) {
			if ("SALESMAN".equals(employee.getJob())) {
				if (highestCommissionSalesman == null
						|| employee.getCommision() > highestCommissionSalesman.getCommision()) {
					highestCommissionSalesman = employee;
				}
			}
		}
		return highestCommissionSalesman;
	}

	public double calculateTotalSalary() {
		double totalSalary = 0;
		for (Employee employee : employees) {
			totalSalary += employee.getSalary();
		}
		return totalSalary;
	}

	public static void main(String[] args) throws ParseException {
		EmployeeTest employeeTest = new EmployeeTest();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
		employeeTest.employees.add(new Employee(1, "Dhruv", "MANAGER", 0, dateFormat.parse("01-JAN-21"), 5000, 0, 10));
		employeeTest.employees
				.add(new Employee(2, "Ujjwal", "SALESMAN", 1, dateFormat.parse("15-FEB-21"), 3000, 500, 20));
		employeeTest.employees
				.add(new Employee(3, "Rohul", "ANALYST", 2, dateFormat.parse("15-FEB-21"), 4000, 400, 30));

		employeeTest.saveEmployeesToFile();

		employeeTest.loadEmployeesFromFile();

		List<Employee> employeesInDept = employeeTest.findEmployeesInDepartment(10);
		System.out.println("Employees in department 13: " + employeesInDept);

		Employee manager = employeeTest.findImmediateManager(2);
		System.out.println("Immediate manager of employee 4: " + manager);

		Map<Integer, Employee> highestPaidPerDept = employeeTest.findHighestPaidInEachDepartment();
		System.out.println("Highest paid per department: " + highestPaidPerDept);

		Map<String, Employee> highestPaidPerRole = employeeTest.findHighestPaidInEachRole();
		System.out.println("Highest paid per role: " + highestPaidPerRole);

		// double totalSalarySum = employeeTest.calculateSumOfSalaries();
		// System.out.println("Sum of salaries of all employees: " + totalSalarySum);
		// }
		//
		// private double calculateSumOfSalaries() {
		//
		// return 0 ;
		// }
		// public static void main1(String[] args) throws ParseException {
		//
		//
		// Employee highestCommissionSalesman =
		// Employee.findSalesmanWithHighestCommission();
		// if (highestCommissionSalesman != null) {
		// System.out.println("Salesman with highest commission: " +
		// highestCommissionSalesman.getName() + " (" +
		// highestCommissionSalesman.getCommision() + ")");
		// } else {
		// System.out.println("No salesman with commission found.");
		// }
	}

}
