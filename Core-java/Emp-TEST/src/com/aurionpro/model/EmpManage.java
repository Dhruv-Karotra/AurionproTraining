package com.aurionpro.model;

import com.aurionpro.model.Emp;

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

public class EmpManage {
	private List<Emp> employeeList;
	static final String FILEPATH="D:\\emp.txt";
	static final String FILEPATH2="D:\\empNew.txt";
	public EmpManage() {
		super();
		this.employeeList=new ArrayList<>();
		loadEmployees();
	}
	
	public void readDataToObject(){
		Scanner sc;
		try {
			sc = new Scanner(Paths.get(FILEPATH));
			while (sc.hasNextLine()) {
		        String line = sc.nextLine();
		        String[] parts = line.split(",");
		        
		        int id = Integer.valueOf(parts[0]);
		        String name = parts[1];
		        String designation = parts[2];
		        int managerId = parts[3].equalsIgnoreCase("NULL") ? 0 : Integer.parseInt(parts[3]);
		        String dOJ = parts[4];
		        double salary = Double.valueOf(parts[5]);
		        double commission = parts[6].equalsIgnoreCase("NULL") ? 0 : Double.parseDouble(parts[6]);
		        int departmentId = parts[7].equalsIgnoreCase("NULL") ? 0 : Integer.parseInt(parts[7]);

		        employeeList.add(new Emp(id,name,designation,managerId,dOJ,salary,commission,departmentId));
		    }
		System.out.println("Total amount of people read: " + employeeList.size());
		for(Emp x:employeeList) {System.out.println(x);}
		} catch (IOException e) {
			e.printStackTrace();
		}    
	}
	
	public void convertDateStringsToDateObjects() {
        for (Emp emp : employeeList) {
            Date dOJ = parseDate(emp.getDOJ()); // Get the DOJ string from Emp and parse it
            emp.setDOJDate(dOJ); // Set the parsed Date object in your Emp object
        }
    }
	
	private Date parseDate(String dateString) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
	    try {
	        return dateFormat.parse(dateString);
	    } catch (ParseException e) {
	        System.err.println("Error parsing date: " + dateString);
	        e.printStackTrace();
	        return null;
	    }
	}
	
	private void loadEmployees() {
		try {
			FileInputStream fis =new FileInputStream(FILEPATH2);
			int availableValue=fis.available();
			if(availableValue!=0) {
				ObjectInputStream in = new ObjectInputStream(fis);
				employeeList=(List<Emp>) in.readObject();
				in.close();
			}
			fis.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("IOException is caught");
		}catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
	
	public void saveEmployeeList() {
		try {
			FileOutputStream file=new FileOutputStream(FILEPATH2);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(employeeList);
			out.flush();
			
			out.close();
			file.close();
			
			System.out.println("Employee list updated successfully");
			
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("IOException is caught");
		}
	}
	
	public List<Emp> getEmployees(){
		return employeeList;
	}
	
	public void deleteAllEmployees() {
		employeeList.clear();
		saveEmployeeList();
	}
	
	public void deleteEmployeeByEmployeeId(int employeeId) {
		boolean isEmployeeFound=false;
		Emp employeeToDelete=null;
		for(Emp x: employeeList) {
			if(x.getEmployeeId()==employeeId) {
				employeeToDelete=x;
				isEmployeeFound=true;
			}
		}
		if(isEmployeeFound) {
			employeeList.remove(employeeToDelete);
			saveEmployeeList();
			System.out.println(employeeList);
			System.out.println("Employee deleted :"+employeeToDelete);
			
		}	
	}
	
	public List<Emp> employeesInDepartment(int departmentId) {
	    List<Emp> employeesInDepartment = new ArrayList<>();
	    for (Emp x : employeeList) {
	        if (x.getDepartmentId() == departmentId) {
	            employeesInDepartment.add(x);
	        }
	    }
	    return employeesInDepartment;
	}
	
	public int countEmployeesByDepartmentID(int departmentId) {
	    int count=0;
	    for (Emp x : employeeList) {
	        if (x.getDepartmentId() == departmentId) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public Emp findManagerByEmployeeID(int employeeId) {
		Emp manager= null;
		int managerId=-1;
		for(Emp x : employeeList) {
			if(x.getEmployeeId()==employeeId) {
				managerId=x.getManagerId();
			}
		}
		for(Emp x : employeeList) {
			if(x.getManagerId()==managerId) {
				manager=x;
			}
		}
		return manager;
	}
	
	public Emp highestPaidEmployeeInDepartment(int departmentId) {
		Emp highestPaidEmployeeInDepartment=null;
		double tempSalary=0;
		for(Emp x : employeeList) {
			if(x.getDepartmentId()==departmentId && tempSalary<x.getSalary()) {
				tempSalary=x.getSalary();
				highestPaidEmployeeInDepartment=x;
			}
		}
		return highestPaidEmployeeInDepartment;
	}
	
	
}
