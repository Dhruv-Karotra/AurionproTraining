package com.aurionpro.test;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length>=2) {
			int numbers[]= new int[args.length];
			for(int i=0; i<args.length; i++) {
				numbers[i]= Integer.parseInt(args[i]);
				System.out.print(numbers[i]);
			}
			
			int largest=numbers[0];
			int secondLargest=Integer.MIN_VALUE;
			System.out.println("MIN VALUE = "+secondLargest);
			for(int i=1;i<args.length;i++) {
				if(largest<numbers[i]) {
					secondLargest=largest;
					largest=numbers[i];
				}
				else if(secondLargest<numbers[i]){
					secondLargest=numbers[i];
				}
				
			}
		}
		else {
			System.out.println("INSUFFICIENT DATA...PLEASE PROVIDE MORE INPUT");
		}
		
		
	}

}
