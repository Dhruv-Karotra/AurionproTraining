package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Emp;

public class EmpTest {
	static final String FILEPATH = "D:\\emp.txt";
	List<Emp> employees= new ArrayList<>();
	
	public static void main(String[] args) {
		EmpTest empTest=new EmpTest();

		try {
			empTest.readDataToObject();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(empTest.getEmployees());
		
		empTest.displayMenu();

	}
	
	
	private void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 5) {
			System.out.println("Enter 1 : Add employee");
			System.out.println("Enter 2 : Delete employee by ID");
			System.out.println("Enter 3 : Find immediate manager of employee");
			System.out.println("Enter 4 : Find highest paid employee of department");
			System.out.println("Enter 5 : Exit");
			System.out.print("Select choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Emp emp = setEmployeeDetails();
				((EmpTest) employees).addEmployee(emp);
				break;

			case 2:
				System.out.print("Enter id to delete employee : ");
				int idToDeleteEmployee = sc.nextInt();
				deleteEmployeeByID(idToDeleteEmployee);
				System.out.println(getEmployees());
				break;

			case 3:
				System.out.print("Enter employee id to find immediate manager : ");
				int idToFindManager = sc.nextInt();
				findManagerByEmployeeID(idToFindManager);
				break;

			case 4:
				System.out.print("Enter department id to find highest paid employee : ");
				int idToFindHighestPaidEmployee = sc.nextInt();
				highestPaidEmployee(idToFindHighestPaidEmployee);
				break;

			case 5:
				break;

			default:
				System.out.println("INVALID CHOICE!");
			}
		}
	}
	
	private String findManagerByEmployeeID(int employeeId) {
		String manager=null;
		int managerId=-1;
		for(Emp x : employees) {
			if(x.getId()==employeeId) {
				managerId=x.getManagerId();
			}
		}
		if(managerId==-1) {return "Invalid employee id";}
		for(Emp x : employees) {
			if(x.getManagerId()==managerId) {
				manager=x.getName();
			}
		}
		return manager;
		
	}
	
	private String highestPaidEmployee(int departmentId) {
		String highestPaidEmployee=null;
		int tempSalary=0;
		for(Emp x : employees) {
			if(tempSalary<x.getSalary()) {
				tempSalary=x.getSalary();
				highestPaidEmployee=x.getName();
			}
		}
		return highestPaidEmployee;
	}
	

	private Emp setEmployeeDetails() {
		Emp employeeToAdd = new Emp();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id : ");
		int id = sc.nextInt();
		employeeToAdd.setId(id);
		sc.nextLine();
		System.out.print("Enter employee name : ");
		String empName = sc.nextLine();
		employeeToAdd.setName(empName);
		System.out.print("Enter designation : ");
		String designation = sc.next();
		employeeToAdd.setDesignation(designation);
		sc.nextLine();
		System.out.print("Enter manager id : ");
		int managerId = sc.nextInt();
		employeeToAdd.setManagerId(managerId);
		sc.nextLine();
		System.out.print("Enter salary : ");
		int salary = sc.nextInt();
		employeeToAdd.setSalary(salary);
		sc.nextLine();
		System.out.print("Enter commission : ");
		String commission = sc.next();
		employeeToAdd.setCommission(commission);
		sc.nextLine();
		System.out.print("Enter department id : ");
		int departmentId = sc.nextInt();
		employeeToAdd.setDepartmentId(departmentId);
		sc.nextLine();
		
		return employeeToAdd;
	}
	
	public void addEmployee(Emp emp) {
		employees.add(emp);
		System.out.println(emp);
		saveEmployee();
	}
	private void readDataToObject() throws IOException {
		Scanner sc = new Scanner(Paths.get("D:\\emp.txt"));
		try {
			

		    while (sc.hasNextLine()) {
		        String line = sc.nextLine();

		        String[] parts = line.split(",");
		        int id = Integer.valueOf(parts[0]);
		        String name = parts[1];
		        String designation = parts[2];
		       // int managerId = Integer.valueOf(parts[3]);
		        Date dOJ = parseDate(parts[4]);
		        int salary = Integer.valueOf(parts[5]);
		       // String commission = parts[6];
		       // int departmentId = Integer.valueOf(parts[7]);
		        int managerId = parts[3].equalsIgnoreCase("NULL") ? 0 : Integer.parseInt(parts[3]);
		        String commission = parts[6].equalsIgnoreCase("NULL") ? null : parts[6];
		        int departmentId = parts[7].equalsIgnoreCase("NULL") ? 0 : Integer.parseInt(parts[7]);

		        employees.add(new Emp(id,name,designation,managerId,dOJ,salary,commission,departmentId));
		    }
		System.out.println("Total amount of people read: " + employees.size());
		}finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
	
	private Date parseDate(String dateString) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("'dd-MMM-yy'");
	    try {
	        return dateFormat.parse(dateString);
	    } catch (ParseException e) {
	        System.err.println("Error parsing date: " + dateString);
	        e.printStackTrace();
	        return null;
	    }
	}
	
	public List<Emp> getEmployees() {
		return employees;
	}

	
	private void loadEmployeeData() {
		try {
			FileInputStream fis = new FileInputStream(FILEPATH);
			int  available= fis.available();
			if (available != 0) {
				ObjectInputStream in = new ObjectInputStream(fis);
				employees = (List<Emp>) in.readObject();
				in.close();
			}
			fis.close();

		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
	
	public void saveEmployee() {
		try {
			FileOutputStream file = new FileOutputStream(FILEPATH);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(employees);
			out.flush();

			out.close();
			file.close();

			System.out.println("employee added successfully!");
		}
		// catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Emp> findEmployeesByDepartmentID(int departmentId) {
	    List<Emp> emp = new ArrayList<>();
	    for (Emp x : employees) {
	        if (x.getDepartmentId() == departmentId) {
	            emp.add(x);
	        }
	    }
	    return emp;
	}
	
	public int countEmployeesByDepartmentID(int departmentId) {
	    int count=0;
	    for (Emp x : employees) {
	        if (x.getDepartmentId() == departmentId) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public void deleteEmployeeByID(int id) {
		Emp employeeToRemove=null;
		for(Emp x :employees) {
			if(x.getId()==id) {
				employeeToRemove=x;
			}
		}
		if(employeeToRemove!=null) {
			employees.remove(employeeToRemove);
		}
	}
	
	
}
