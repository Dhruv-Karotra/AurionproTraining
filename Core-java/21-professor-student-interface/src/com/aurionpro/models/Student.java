package com.aurionpro.models;

import java.time.LocalDate;

public class Student extends Person{
	
	private String branch;
	
	public Student(int id, String name, LocalDate dob,String branch) {
		super(id, name, dob);
		this.branch=branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student\n"+super.toString()+"\tbranch=" + branch + "]";
	}
	
	
	
	
	
}
