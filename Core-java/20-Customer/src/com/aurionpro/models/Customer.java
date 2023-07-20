package com.aurionpro.models;

import java.util.Scanner;
import java.util.regex.Pattern;
public class Customer {
	private int id;
	private String name;
	private String email_id;
	private String password;
	
	public static void main(String[] args) {
		Customer[] customer=new Customer[2];
		for(int i=0;i<customer.length;i++) {
			customer[i]=new Customer();
			setCustomerValues(customer[i]);
		}
		
		for(int i=0;i<customer.length;i++) {
			System.out.println("The details of customer"+(i+1)+" are : ");
			printCustomerDetails(customer[i]);
		}
		
		System.out.println("SORTING CUSTOMER IN ASCENDING ORDER OF NAMES : ");
		sortCustomerByNames(customer);
		for(Customer x: customer ) {
			System.out.println(x);
		}
	}
	
	public Customer(int id, String name, String email_id, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email_id = email_id;
		this.password = password;
	}
	
	public Customer() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
	    do {
	        this.email_id = validateEmail(email_id);
	       // System.out.println(this.email_id);
	       // System.out.println(email_id);
	        if (!this.email_id.equals(email_id)) {
	            System.out.println("Invalid email format. Please enter a valid email: ");
	            Scanner sc = new Scanner(System.in);
	            email_id = sc.next();
	        }
	    } while (!this.email_id.equals(email_id));
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email_id=" + email_id + ", password=" + password + "]";
	}

	public static boolean patternMatches(String emailAddress, String regexPattern) {
	    return Pattern.compile(regexPattern)
	      .matcher(emailAddress)
	      .matches();
	}
	
	private String validateEmail(String email) {
		String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
		        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		if(patternMatches(email, regexPattern)) {
			return email;
		}	
		return " ";		
	}
	
	private static void setCustomerValues(Customer c) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the ID : ");
		int id=sc.nextInt();
		System.out.println("Enter the Name : ");
		String name=sc.next();
		System.out.println("Enter the e-mail : ");
		String email_id=sc.next();
		System.out.println("Enter the password : ");
		String password=sc.next();
		
		c.setId(id);
		c.setName(name);
		c.setEmail_id(email_id);
		c.setPassword(password);	
	}
	
	private static void printCustomerDetails(Customer c) {
		System.out.println("The id : "+c.getId());
		System.out.println("The name : "+c.getName());
		System.out.println("The Email : "+c.getEmail_id());
		System.out.println("The password : "+c.getPassword());
		
	}
	
	private static void sortCustomerByNames(Customer[] c) {
		Customer temp=null;
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i].getName().compareTo(c[j].getName())>0) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
	}
	
}
