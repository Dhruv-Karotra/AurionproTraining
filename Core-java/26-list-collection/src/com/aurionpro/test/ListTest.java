package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);                     
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(numbers.size());          // returns length
		System.out.println(numbers);
		
		System.out.println(numbers.contains(30));    // returns true or false
		
		numbers.remove(2);                           // index value in remove
		System.out.println(numbers);
		
		numbers.clear();                             // empties list
		System.out.println(numbers);
	}
}
