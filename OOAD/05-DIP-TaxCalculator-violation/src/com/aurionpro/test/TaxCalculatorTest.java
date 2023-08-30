package com.aurionpro.test;

import com.aurionpro.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		TaxCalculator t1=new TaxCalculator();
		System.out.println(t1.calculateTax(100,10));
		
		TaxCalculator t2=new TaxCalculator();
		t1.calculateTax(2000,0);
	}

}
