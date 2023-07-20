package com.aurionpro.test;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int firstNumber=Integer.parseInt(args[0]);
			int SecNumber=Integer.parseInt(args[1]);
			int div=firstNumber/SecNumber;
			System.out.println(div);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by 0");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Access invalid at index position");
		}
		catch(NumberFormatException e){
			System.out.println("Conversion is invalid");
		}
		finally {
			System.out.println("Sure finally block executed");
		}
		System.out.println("hi, out of try blockk");
		



	}

}
// divide by 0 --> ArithmeticException
// args entered not number --> NumberFormatException
// if args[0] or args[1] not passed then --> ArrayIndexOutOfBoundsException