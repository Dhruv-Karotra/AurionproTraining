package com.aurionpro.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeUtil {

	List<Employee> employeeList;
	private static boolean initialLoad = false;

	public EmployeeUtil() {
		this.employeeList = new ArrayList<>();
		loadEmployee();
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	@SuppressWarnings("unchecked")
	private void loadEmployee() {
		if (checkIfFileEmpty() && !initialLoad) {
			employeeList = new EmployeeReader().readEmployeeFromFile("D:\\text\\emp.txt");
			initialLoad = true;
		} else if (!checkIfFileEmpty()) {
			try {
				FileInputStream file = new FileInputStream("D:\\text\\emp-serialize.txt");
				ObjectInputStream in = new ObjectInputStream(file);

				this.employeeList = (List<Employee>) in.readObject();

				in.close();
				file.close();

				System.out.println("Object de-serialized successfully");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
		saveEmployeeList();
	}
	
	private Employee setEmployeeDetails() {
		Employee employeeToAdd=new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee id : ");
		int id = sc.nextInt();
		employeeToAdd.setId(id);
		sc.nextLine();
		System.out.print("Enter employee name : ");
		String empName = sc.nextLine();
		employeeToAdd.setName(empName);
		System.out.print("Enter role : ");
		String role = sc.next();
		employeeToAdd.setRole(role);
		sc.nextLine();
		System.out.print("Enter salary : ");
		double salary = sc.nextDouble();
		employeeToAdd.setSalary(salary);
		sc.nextLine();
		System.out.print("Enter manager id : ");
		int managerId = sc.nextInt();
		employeeToAdd.setManagerId(managerId);
		sc.nextLine();
		System.out.print("Enter commission : ");
		double commission = sc.nextDouble();
		employeeToAdd.setCommission(commission);
		sc.nextLine();
		System.out.print("Enter department id : ");
		int departmentId = sc.nextInt();
		employeeToAdd.setDepartmentId(departmentId);
		employeeToAdd.setDateOfJoining(LocalDate.now());
		
		return employeeToAdd;
	}

	public void removeEmployee(Employee employee) {
		if (employeeList.contains(employee)) {
			employeeList.remove(employee);
			saveEmployeeList();
		}
	}

	private void saveEmployeeList() {
		try {
			FileOutputStream file = new FileOutputStream("D:\\text\\emp-serialize.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(employeeList);

			out.close();
			file.close();

			System.out.println("Object serialized successfully");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean checkIfFileEmpty() {
		try {
			FileInputStream file = new FileInputStream("D:\\text\\emp-serialize.txt");
			if (file.read() != -1) {
				return false;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	public void deleteEmployeeByEmployeeId(int employeeId) {
		boolean isEmployeeFound = false;
		Employee employeeToDelete = null;
		for (Employee x : employeeList) {
			if (x.getId() == employeeId) {
				employeeToDelete = x;
				isEmployeeFound = true;
			}
		}
		if (isEmployeeFound) {
			employeeList.remove(employeeToDelete);
			saveEmployeeList();
			System.out.println(employeeList);
			System.out.println("Employee deleted :" + employeeToDelete);

		}
	}
	
	public List<Employee> findEmployeesInDepartment(int departmentId) {
        List<Employee> employeesInDepartmentList = employeeList.stream()
            .filter(employee -> employee.getDepartmentId() == departmentId)
            .collect(Collectors.toList());
        
        return employeesInDepartmentList;
    }

	public int countEmployeesInSpecificDepartment(int departmentId) {
		int count = 0;
		for (Employee x : employeeList) {
			if (x.getDepartmentId() == departmentId) {
				count++;
			}
		}
		return count;
	}
	
	public Map<Integer, Long> countEmployeesInEachDepartment() {
        Map<Integer, Long> countEmployeesInEachDeparment = employeeList.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartmentId,
                Collectors.counting()
            ));
        
        return countEmployeesInEachDeparment;
    }


	public Employee findImmediateManagerByEmployeeID(int employeeId) {
		Employee manager = null;
		int managerId = -1;
		for (Employee x : employeeList) {
			if (x.getId() == employeeId) {
				managerId = x.getManagerId();
			}
		}
		for (Employee x : employeeList) {
			if (x.getId() == managerId) {
				manager = x;
			}
		}
		return manager;
	}
	
	public Employee highestPaidEmployeeInSpecificDepartment(int departmentId) {
		Employee highestPaidEmployeeInDepartment = null;
		double tempSalary = 0;
		for (Employee x : employeeList) {
			if (x.getDepartmentId() == departmentId && tempSalary < x.getSalary()) {
				tempSalary = x.getSalary();
				highestPaidEmployeeInDepartment = x;
			}
		}
		return highestPaidEmployeeInDepartment;
	}

	public Map<Integer, Optional<Employee>> highestPaidEmployeeInEachDepartment() {

		Map<Integer, Optional<Employee>> highestPaidEmployeeInEachDepartmentMap = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentId, 
				Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		
		return highestPaidEmployeeInEachDepartmentMap;
	}
	
	public Employee highestPaidEmployeeInSpecificRole(String role) {
		Employee highestPaidEmployeeInSpecificRole = null;
		double tempSalary = 0;
		for (Employee x : employeeList) {
			if (x.getRole().equalsIgnoreCase(role) && tempSalary < x.getSalary()) {
				tempSalary = x.getSalary();
				highestPaidEmployeeInSpecificRole = x;
			}
		}
		return highestPaidEmployeeInSpecificRole;
	}
	
	public Map<String, Optional<Employee>> highestPaidEmployeeInEachRole() {

		Map<String, Optional<Employee>> highestPaidEmployeeInEachRoleMap = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getRole, 
				Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		
		return highestPaidEmployeeInEachRoleMap;
	}
	
	public Employee salesmanWithHighestCommission() {

		Employee salesmanWithHighestCommission = employeeList.stream()
				.filter((employee)->employee.getRole().equalsIgnoreCase("salesman"))
				.max(Comparator.comparingDouble(Employee::getCommission)).orElse(null);
		
		return salesmanWithHighestCommission;
	}
	
	public double sumOfSalaries() {
		Double totalSalary = employeeList.stream()
				.map((employee)->employee.getSalary())
				.reduce(0.0,(a,b)->a+b);
		
		return totalSalary;
	}
	
	public List<Employee> employeesJoinedBetweenGivenDates(LocalDate FirstDate, LocalDate SecondDate) {
        List<Employee> employeesJoinedBetweenGivenDates = employeeList.stream()
            .filter(employee -> employee.getDateOfJoining().isAfter(FirstDate) && employee.getDateOfJoining().isBefore(SecondDate))
            .collect(Collectors.toList());
        
        return employeesJoinedBetweenGivenDates;
    }


	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != -1) {
			System.out.println("Enter 1 : Add employee");
			System.out.println("Enter 2 : Delete employee");
			System.out.println("Enter 3 : List employees in department by department ID");
			System.out.println("Enter 4 : Count employees in a specific department by department ID");
			System.out.println("Enter 5 : Count employees in each department");
			System.out.println("Enter 6 : Find immediate manager of employee");
			System.out.println("Enter 7 : Find highest paid employee in a specific department");
			System.out.println("Enter 8 : Find highest paid employee in each department");
			System.out.println("Enter 9: Find highest paid employee in a specific role");
			System.out.println("Enter 10 : Find highest paid employee in each role");
			System.out.println("Enter 11 : Find salesman with highest commission");
			System.out.println("Enter 12 : Find sum of salaries of all employees");
			System.out.println("Enter 13 : Find employees joined between two dates");
			System.out.println("Enter 14 : List all employees");
			System.out.println("Enter -1 : Exit");
			System.out.print("Select choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Employee emp=setEmployeeDetails();
				addEmployee(emp);
				break;
			case 2:
				System.out.print("Enter employee id to delete employee : ");
				int employeeId = sc.nextInt();
				try {
					deleteEmployeeByEmployeeId(employeeId);
				} catch (Exception e) {
					System.out.println("An error occurred while deleting the employee: " + e.getMessage());
				}
				break;
			case 3:
				System.out.print("Enter department id to find employees : ");
				int departmentId = sc.nextInt();
				System.out.println(findEmployeesInDepartment(departmentId));
				break;	
			case 4 : 
				System.out.print("Enter department id : ");
				int deptId=sc.nextInt();
				System.out.println("Number of employees are in department "+deptId+" are : "+countEmployeesInSpecificDepartment(deptId));
				break;
			case 5 : 
				System.out.println("Number of employees in each department : ");
				System.out.println(countEmployeesInEachDepartment());
				break;
			case 6:
				System.out.print("Enter employee id to find immediate manager : ");
				int employeeIdToFindImmediateManager = sc.nextInt();
				System.out.println(findImmediateManagerByEmployeeID(employeeIdToFindImmediateManager));
				break;
			case 7:
				System.out.print("Enter department id to find highest paid employee : ");
				int departmentIdToFindHighestPaidEmployee = sc.nextInt();
				System.out.println(highestPaidEmployeeInSpecificDepartment(departmentIdToFindHighestPaidEmployee));
				break;
			case 8:
				System.out.print("Highest paid employee in each department");
				System.out.println(highestPaidEmployeeInEachDepartment());
				break;
			case 9:
				System.out.print("Enter a specific role to find highest paid employee : ");
				String role = sc.next();
				System.out.println(highestPaidEmployeeInSpecificRole(role));
				break;
			case 10:
				System.out.println("Highest paid employee in each role : ");
				System.out.println(highestPaidEmployeeInEachRole());
				break;
			case 11:
				System.out.print("Salesman with highest commission : ");
				System.out.println(salesmanWithHighestCommission());
				break;
			case 12:
				System.out.println("Sum of salaries of all employees : "+sumOfSalaries());
				break;
			case 13:
				System.out.print("Enter day number of First Date : ");
				int d1=sc.nextInt();
				System.out.print("Enter month number of First Date : ");
				int m1=sc.nextInt();
				System.out.print("Enter year number of First Date : ");
				int y1=sc.nextInt();
				System.out.print("Enter day number of Second Date : ");
				int d2=sc.nextInt();
				System.out.print("Enter month number of Second Date : ");
				int m2=sc.nextInt();
				System.out.print("Enter year number of Second Date : ");
				int y2=sc.nextInt();
				LocalDate firstDate = LocalDate.of(y1, m1, d1);
				LocalDate SecondDate = LocalDate.of(y2, m2, d2);
				System.out.println("Employees joined between given dates are : ");
				System.out.println(employeesJoinedBetweenGivenDates(firstDate,SecondDate));
				break;
			case 14:
				List<Employee> employeeList = getEmployeeList();
				if (employeeList.isEmpty())
					System.out.println("Employee list is empty");
				else
					System.out.println(employeeList);
				break;
			case -1:
				break;
			default:
				System.out.println("INVALID CHOICE");
			}
		}

	}

}
