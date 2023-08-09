package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapRegionCountry {
	public static void main(String[] args) {

		Map<Integer, String> regionMap = new HashMap<>();
		Map<String, String> countryMap = new HashMap<>();

		regionMap.put(1, "Europe");
		regionMap.put(2, "America");
		regionMap.put(3, "Asia");
		regionMap.put(4, "Middle East and Africa");

		countryMap.put("IT", "Italy");
		countryMap.put("JP", "Japan");
		countryMap.put("US", "United States of America");
		countryMap.put("CA", "Canada");
		countryMap.put("CN", "China");
		countryMap.put("IN", "India");
		countryMap.put("AU", "Australia");
		countryMap.put("ZW", "Zimbabwe");
		countryMap.put("SG", "Singapore");
		countryMap.put("UK", "United Kingdom");
		countryMap.put("FR", "France");
		countryMap.put("DE", "Germany");
		countryMap.put("ZM", "Zambia");
		countryMap.put("EG", "Egypt");
		countryMap.put("BR", "Brazil");
		countryMap.put("CH", "Switzerland");
		countryMap.put("NL", "Netherlands");
		countryMap.put("MX", "Mexico");
		countryMap.put("KW", "Kuwait");
		countryMap.put("IL", "Israel");
		countryMap.put("DK", "Denmark");
		countryMap.put("HK", "HongKong");
		countryMap.put("NG", "Nigeria");
		countryMap.put("AR", "Argentina");
		countryMap.put("BE", "Belgium");

		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Search region by region key");
		System.out.println("2 : Search countries by region key");
		System.out.print("Enter choice : ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 : 
			System.out.print("Enter region key : ");
			int regionkey=sc.nextInt();
			if(!regionMap.containsKey(regionkey)) 
				System.out.println("Invalid region key");
			else
				getRegionByRegionKey(regionkey,regionMap);
			break;
		
		case 2 : 
			System.out.print("Enter region ID : ");
			int regionKeyToGetCountries=sc.nextInt();
			if(!regionMap.containsKey(regionKeyToGetCountries)) 
				System.out.println("Invalid region key");
			else 
				System.out.println(getCountriesByRegionKey(regionKeyToGetCountries,regionMap,countryMap));
			break;
		
		default : System.out.println("Invalid choice");
		}

		

//		System.out.print("Enter the key of the country : ");
//		String countryKey = sc.next();
//
//		switch (countryKey) {
//		case "IT":
//			System.out.println("The region is : " + countryMap.get("IT"));
//			break;
//		case "JP":
//			System.out.println("The region is : " + countryMap.get("JP"));
//			break;
//		case "US":
//			System.out.println("The region is : " + countryMap.get("US"));
//			break;
//		case "CA":
//			System.out.println("The region is : " + countryMap.get("CA"));
//			break;
//		case "CN":
//			System.out.println("The region is : " + countryMap.get("CN"));
//			break;
//		case "IN":
//			System.out.println("The region is : " + countryMap.get("IN"));
//			break;
//
//		default:
//			System.out.println("Invalid region key!");
//		}
		
		

	}
	
	public static int RegionKeyByCountryKey(String countryKey) {
        switch (countryKey) {
            case "IT":case "UK":case "FR":case "DE":case "CH":case "NL":case "BE":case "DK":
                return 1;
            case "US":case "CA":case "BR":case "MX":case "AR":
                return 2;
            case "JP":case "CN":case "IN":case "AU": case "SG":case "HK":
                return 3;
            case "ZW": case "ZM":case "EG":case "KW":case "IL":case "NG":
                return 4;
            default:
                return -1;
        }
    }
	
//	public static List<String> getCountriesByRegionID(int regionKey,Map<Integer, String> regionMap, Map<String, String> countryMap) {
//	    
//	    Map<Integer, List<String>> keyRegionCountryMap = new HashMap<>();
//	    for (String x : countryMap.keySet()) {
//	        int regionKey = RegionKeyByCountryKey(x);
//	        keyRegionCountryMap.putIfAbsent(regionKey, new ArrayList<>());
//	        keyRegionCountryMap.get(regionKey).add(countryMap.get(x));
//	    }
//	    
//	    keyRegionCountryMap.forEach((key,value)->{
//			System.out.println(key +" "+value);
//		});
//	    
//	    System.out.print("Enter the key of the region to get all countries : ");
//	    Scanner sc = new Scanner(System.in);
//	    int regionKeyToGetCountries = sc.nextInt();
//
//	    List<String> countriesInRegion = keyRegionCountryMap.get(regionKeyToGetCountries);
////	    if(countriesInRegion!=null) {
////	    	System.out.println(countriesInRegion);
////	    }else {System.out.println("Invalid region id");}
//	    return countriesInRegion;
//	}
	
public static List<String> getCountriesByRegionKey(int regionKeyToGetCountries,Map<Integer, String> regionMap, Map<String, String> countryMap) {
	   
	    Map<Integer, List<String>> keyRegionCountryMap = new HashMap<>();
	    for (String x : countryMap.keySet()) {
	        int regionKey = RegionKeyByCountryKey(x);
	        keyRegionCountryMap.putIfAbsent(regionKey, new ArrayList<>());
	        keyRegionCountryMap.get(regionKey).add(countryMap.get(x));
	    }
	    
	    keyRegionCountryMap.forEach((key,value)->{
			System.out.println(key +" "+value);
		});
	    System.out.println("Countries in region "+regionMap.get(regionKeyToGetCountries)+" : ");
	    List<String> countriesInRegion = keyRegionCountryMap.get(regionKeyToGetCountries);
	    return countriesInRegion;
	}
	
	public static String getRegionByRegionKey(int regionKey, Map<Integer, String> regionMap) {
		switch (regionKey) {
		case 1:
			return regionMap.get(1);
		case 2:
			return regionMap.get(2);
		case 3:
			return regionMap.get(3);
		case 4:
			return regionMap.get(4);
		default:
			return "Invalid region key";
		}
	}
	



}
