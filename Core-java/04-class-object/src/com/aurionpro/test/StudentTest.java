package com.aurionpro.test;

import com.aurionpro.models.Student;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.id=1;
		student.name="Dhruv";
		student.email="abc@gmail.com";
		student.percentage=66.5;
		
		System.out.println("Id : "+student.id+"  Name : "+student.name);
	}

}
