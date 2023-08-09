package com.aurionpro.test;
import com.aurionpro.model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> students= new ArrayList<>();
		
		students.add(new Student(1,"Dhruv",45));
		students.add(new Student(2,"Nikul",35));
		students.add(new Student(3,"Rajesh",95));
		students.add(new Student(4,"Pankaj",15));
		students.add(new Student(5,"Jigna",65));
		
		for(Student x : students) {
			System.out.println(x);
		}
		
		Student maxPercentageStudent=students.get(0);
		for(Student x : students) {
			if(x.getPercentage()>maxPercentageStudent.getPercentage()) {
				maxPercentageStudent=x;
			}
		}
		System.out.println("Max percentage student : "+maxPercentageStudent);
		
		System.out.println("Sorting descending");
		students.sort(Comparator.comparingDouble(Student::getPercentage).reversed());
		for(Student x : students) {
			System.out.println(x);
		}
		
		System.out.println("Sorting by names");
		students.sort(Comparator.comparing(Student::getName));
		for(Student x : students) {
			System.out.println(x);
		}
	
	
	}

}
