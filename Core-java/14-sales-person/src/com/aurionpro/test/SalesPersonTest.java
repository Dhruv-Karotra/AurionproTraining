package com.aurionpro.test;
import com.aurionpro.models.*;
public class SalesPersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson[] salesPerson= {
				new SalesPerson(1,"Dhruv",City.MUMBAI,1,20000),
				new SalesPerson(2,"Raj",City.CHENNAI,1,10000),
				new SalesPerson(3,"Gautam",City.BANGLORE,1,150000),
				new SalesPerson(4,"Suswar",City.MUMBAI,1,13000),
				new SalesPerson(5,"Aniket",City.MUMBAI,1,12000),
				new SalesPerson(6,"Nikul",City.CHENNAI,1,10000),
				new SalesPerson(7,"Rajesh",City.CHENNAI,1,1000),
				new SalesPerson(8,"Pankaj",City.BANGLORE,1,40000)
		};
		
		for(SalesPerson x: salesPerson) {
			System.out.println(x);
		}
		
		SalesPerson maxSalesPerson=getHighestSales(salesPerson);
		System.out.println("Person with highest sales : "+maxSalesPerson);
		
		double TotalSales=getTotalSales(salesPerson);
		System.out.println("Total sales : "+TotalSales);
		
		/*SalesPerson maxSalesPersonMumbai=getHighestSalesInCity(salesPerson,City.MUMBAI);
		System.out.println("Person with highest sales in mumbai : "+maxSalesPersonMumbai);
		
		SalesPerson maxSalesPersonChennai=getHighestSalesInCity(salesPerson,City.CHENNAI);
		System.out.println("Person with highest sales in mumbai : "+maxSalesPersonChennai);
		
		SalesPerson maxSalesPersonBanglore=getHighestSalesInCity(salesPerson,City.BANGLORE);
		System.out.println("Person with highest sales in mumbai : "+maxSalesPersonBanglore);
		
		double TotalSalesMumbai=getTotalSalesInCity(salesPerson, City.MUMBAI);
		System.out.println("Total sales in Mumbai : "+TotalSalesMumbai);
		
		double TotalSalesChennai=getTotalSalesInCity(salesPerson, City.CHENNAI);
		System.out.println("Total sales in Mumbai : "+TotalSalesChennai);
		
		double TotalSalesBanglore=getTotalSalesInCity(salesPerson, City.BANGLORE);
		System.out.println("Total sales in Mumbai : "+TotalSalesBanglore);  */
		
		City[] cities=City.class.getEnumConstants();  // to get enum constants in an array
		
		for(City x : cities) {
			double TotalSalesInCity=getTotalSalesInCity(salesPerson,x);
			System.out.println("Total Sales in City " +x+" : "+TotalSalesInCity);
		}
		
		for(City x : cities) {
			SalesPerson HighestSalesPersonInCity=getHighestSalesInCity(salesPerson,x);
			System.out.println("Max Sales Person in City " +x+" : "+HighestSalesPersonInCity);
		}
	}
	
	private static SalesPerson getHighestSales(SalesPerson[] salesPerson) {
		SalesPerson maxSales=salesPerson[0];
		for(int i=0;i<salesPerson.length;i++) {
			if(salesPerson[i].getSalesAmount()>maxSales.getSalesAmount()) {
				maxSales=salesPerson[i];
			}
		}
		return maxSales;
	}
	
	private static SalesPerson getHighestSalesInCity(SalesPerson[] salesPerson, City city) {
		SalesPerson maxSales=null;
		for(int i=0;i<salesPerson.length;i++) {
			if(maxSales==null && salesPerson[i].getCity().equals(city)) {
				maxSales=salesPerson[i];
			}
			if(maxSales!=null) {
				if(salesPerson[i].getCity().equals(city) && salesPerson[i].getSalesAmount()>maxSales.getSalesAmount()) {
					maxSales=salesPerson[i];
				}
			}  	
		}
		return maxSales;
	}
	
	private  static double getTotalSales(SalesPerson[] salesPerson) {
		double TotalSales=0;
		for(int i=0;i<salesPerson.length;i++) {
			TotalSales+=salesPerson[i].getSalesAmount();
		}
		return TotalSales;
	}
	
	private static double getTotalSalesInCity(SalesPerson[] salesPerson, City city) {
		double TotalSalesInCity=0;
		for(int i=0;i<salesPerson.length;i++) {
			if(salesPerson[i].getCity().equals(city)) {
				TotalSalesInCity+=salesPerson[i].getSalesAmount();
			}
		}
		return TotalSalesInCity;
	}

}
