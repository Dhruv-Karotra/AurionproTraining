package com.aurionpro.test;

import com.aurionpro.model.DBLogger;
import com.aurionpro.model.ILogger;
import com.aurionpro.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		
		ILogger logger = new DBLogger();
        TaxCalculator t1 = new TaxCalculator(logger);
        System.out.println(t1.calculateTax(100, 10));
        
        TaxCalculator t2 = new TaxCalculator(logger);
        t2.calculateTax(2000, 0);
	}

}
