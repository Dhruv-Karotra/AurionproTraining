package com.aurionpro.test;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class OccurenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numberList=Arrays.asList(20,30,40,50,50,10,10,40,20);
		
		for(Integer x : numberList) {
			System.out.print(x+ " ");
		}
		
		Map<Integer, Integer> map=new HashMap<>();
		System.out.println("Keys with occurences : ");
		for(Integer x : numberList) {
			if(map.containsKey(x)) {
				map.put(x,map.get(x)+1);
			}
			else {
				map.put(x, 1);
			}
		}
		
		map.forEach((key, value)->{
			System.out.println(key+"\t"+value);
		});
	}

}
