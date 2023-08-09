
package com.aurionpro.models;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Scanner;
 
 
public class Reflection {
	public static void main(String[] args) throws ClassNotFoundException,NoSuchMethodException,SecurityException{
		Scanner sc=new Scanner(System.in); 
		StringBuffer className=new StringBuffer();
		for(int i=0;i<args.length;i++) {
			className.append(args[i]);
		}
		Class<?> tempClass = Class.forName(className.toString());
		
		System.out.println("----------------------------------------------------");
		System.out.println("constructors");
		Constructor<?>[] declaredConstructors = tempClass.getDeclaredConstructors();
		for(Constructor x: declaredConstructors) {
			System.out.println(x);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("methods");
		int count=0;
		Method[] declaredMethods = tempClass.getDeclaredMethods();
		for(Method x:declaredMethods) {
			count++;
			System.out.println(count+" "+x);
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("fields");
		Field[] declaredFields = tempClass.getDeclaredFields();
		for(Field x:declaredFields) {
			System.out.println(x);
		}
	}
 
}