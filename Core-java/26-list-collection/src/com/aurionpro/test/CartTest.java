package com.aurionpro.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.*;
public class CartTest {

	public static void main(String[] args) {
		
//		List<Cart> cartList=new ArrayList<Cart>();
		List<Cart> cartList=Arrays.asList(new Cart("Tomato",1,150),
										new Cart("Onion",1,30),
										new Cart("Shimlamirch",5,50));
		
		//cartList.add(1, new Cart("LadysFinger",5,80))   adds the object at specific index and rightshifts the next objects
		//cartList.set(1, new Cart("LadysFinger",5,80))   replaces the object at specific index
		double totalCartPrice=0;
		for(Cart x : cartList) {
			totalCartPrice+=x.getTotalProductPrice();
		}
		
		System.out.println("Total cart price "+totalCartPrice);
	}
	
	

}
 