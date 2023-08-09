package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>(); // key value pair             key not as index
		
		map.put(1, "Dhruv"); 
		map.put(2, "Jigna");
		map.put(2, "abcd");           // if used put() with same index then latest key value will be set
		map.put(3, "Pankaj");		
		
		Set<Entry<Integer, String>> entrySet=map.entrySet();
		for(Entry x : entrySet) {
			System.out.println("KEY : "+x.getKey()+" ,VALUE : "+x.getValue());
		}
		
		map.forEach((key,value)->{
			System.out.println(key +" "+value);
		});
		
		
//		System.out.println("--------------------");
//		System.out.println(map.containsValue("Dhruv"));
//		System.out.println(map.remove(1));
//		System.out.println(map.containsValue("Dhruv"));
//		System.out.println(map.get(2));
		
		Scanner sc=new Scanner(System.in);
		int keyRemove=-1;
		System.out.println("Enter name to delete : ");
		String name=sc.next();
		
		for(Integer x:map.keySet()) {
			if(map.get(x).equals(name)){
				keyRemove=x;
			}
		}
		if(keyRemove!=-1) {
			map.remove(keyRemove);	
		}
		
//		  if (nameMap.containsValue(inputName)) {    
//			     nameMap.values().removeIf(value -> value.equals(inputName)); 
//			     System.out.println("Name removed from the map."); 
//			    } 
//			    else { 
//			     System.out.println("Name dosen't exist"); 
//			    } 
//		
		map.forEach((key,value)->{
			System.out.println(key +" "+value);
		});
		
		
		
	}

}
