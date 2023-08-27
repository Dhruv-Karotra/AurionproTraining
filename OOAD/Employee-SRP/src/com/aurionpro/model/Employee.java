package com.aurionpro.model;

public class Employee {
	private int id;
	private String name;
	private double basicSalary;
	private double hra;
	private double da;
	private double ta;
	public Employee(int id, String name, double basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hra=0.02*basicSalary;
		this.da=0.15*basicSalary;
		this.ta=0.1*basicSalary;
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
	
	public double calculateMonthlySalary() {
		return (basicSalary+hra+da+ta);
	}
}
