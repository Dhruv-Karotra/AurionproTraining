package com.aurionpro.model;

public class Employee {
	private int id;
	private String name;
	private double basicSalary;
	private double hra=0;
	private double da=0;
	private double ta=0;
	public Employee(int id, String name, double basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		double hra=0.02*basicSalary;
		double da=0.15*basicSalary;
		double ta=0.1*basicSalary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public double calculateTotalSalary() {
		return (basicSalary+hra+da+ta)*12;
	}
	
	public double calculateTax() {
		double tax=0;
		if(calculateTotalSalary()>500000 && calculateTotalSalary()<800000)
			tax=10;
		else if(calculateTotalSalary()>800000 && calculateTotalSalary()<100000)
			tax=20;
		else if(calculateTotalSalary()>1000000)
			tax=30;
		return tax;
	}
	
	public void printSalarySlip() {
		double monthlyGrossSalary=calculateTotalSalary()/12;
		double monthlyNetSalary=monthlyGrossSalary-(monthlyGrossSalary*calculateTax()*0.01);
		System.out.println("Monthy Gross Salary : "+monthlyGrossSalary);
		System.out.println("Monthy Net Salary : "+monthlyNetSalary);
	}
	
	
	
	
}
