package com.aurionpro.model;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {

	private static final long serialVersionUID = 1L;
	private int employeeId;
	private String name;
	private String designation;
	private int managerId;
	private String DOJ;
	private double salary;
	private double commission;
	private int departmentId;
	
	private Date DOJDate;
	
	public Emp(int employeeId, String name, String designation, int managerId, String dOJ, double salary,
			double commission, int departmentId) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.managerId = managerId;
		this.DOJ = dOJ;
		this.salary = salary;
		this.commission = commission;
		this.departmentId = departmentId;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

    public Date getDOJDate() {
        return DOJDate;
    }

    public void setDOJDate(Date dOJDate) {
        this.DOJDate = dOJDate;
    }

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Emp [employeeId=" + employeeId + ", name=" + name + ", designation=" + designation + ", managerId="
				+ managerId + ", DOJ=" + DOJ + ", salary=" + salary + ", commission=" + commission + ", departmentId="
				+ departmentId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DOJ == null) ? 0 : DOJ.hashCode());
		result = prime * result + ((DOJDate == null) ? 0 : DOJDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(commission);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + departmentId;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + employeeId;
		result = prime * result + managerId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (DOJ == null) {
			if (other.DOJ != null)
				return false;
		} else if (!DOJ.equals(other.DOJ))
			return false;
		if (DOJDate == null) {
			if (other.DOJDate != null)
				return false;
		} else if (!DOJDate.equals(other.DOJDate))
			return false;
		if (Double.doubleToLongBits(commission) != Double.doubleToLongBits(other.commission))
			return false;
		if (departmentId != other.departmentId)
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (managerId != other.managerId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	

	

	

}
