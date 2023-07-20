package com.aurionpro.models;

public abstract class Employee {
	private long employeeId;
	private String name;
	private double basic;
	
	public Employee(long employeeId, String name, double basic) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.basic = basic;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public abstract double calculateAnnualCTC();

	@Override
	public String toString() {
		return "employeeId=" + employeeId + "\t name=" + name + "\t basic=" + basic + "\n";
	}
	
	
	
	
}
