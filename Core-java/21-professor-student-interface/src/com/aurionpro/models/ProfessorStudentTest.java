package com.aurionpro.models;

import java.time.LocalDate;

public class ProfessorStudentTest {
	public static void main(String[] args) {
		Student student=new Student(1,"Dhruv",LocalDate.of(2001, 02, 05),"IT");
		System.out.println(student);
		
		Professor professor=new Professor(1,"Raj",LocalDate.of(2001, 04, 10),15000);
		System.out.println(professor);
	}
}
