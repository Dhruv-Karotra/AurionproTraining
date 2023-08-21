package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		List<Student> studentList= Arrays.asList(new Student(1,"Dhruv",44,Arrays.asList("Playing","Singing","Sleeping")),
				new Student(2,"Jigna",55,Arrays.asList("Singing","Dancing")),
				new Student(3,"Pankaj",99,Arrays.asList("Playing","Singing")),
				new Student(4,"Nikul",77,Arrays.asList("Playing","Treking")),
				new Student(5,"Rajesh",33,Arrays.asList("Playing","Treking","Singing")),
				new Student(5,"Rajesh",35,Arrays.asList("Treking","Singing")));
		
		System.out.println("Distinct Hobbies List : ");
		List<String> distinctHobbiesList= studentList.stream()
		.map((student)->student.getHobbies())   //function logic should be inside map()
		.flatMap((list)->list.stream()).distinct()
		.collect(Collectors.toList());
		
		//distinctHobbiesList.forEach(System.out::println);
		System.out.println(distinctHobbiesList);
		
		System.out.println("Distinct Name List : ");
		Set<String> distinctNameList = studentList.stream()
		.map((student)->student.getName()).distinct()   //function logic should be inside map()
		.collect(Collectors.toSet());
		
		System.out.println(distinctNameList);
		
		//thread- runnable,running,deadstay

	}

}
