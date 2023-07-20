package com.aurionpro.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public abstract class Person {
	private int id;
	private String name;
	private LocalDate dob;
	public Person(int id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public String formatDate(LocalDate date) {
		return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dob=" + formatDate(dob) + "]";
	}
	
	
	
	
}
