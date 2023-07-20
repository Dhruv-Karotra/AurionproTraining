
package com.aurionpro.models;

import java.lang.invoke.CallSite;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.lang.reflect.TypeVariable;
import java.util.Scanner;
 
 
public class ReflectionTry {
	public static void main(String[] args) throws ClassNotFoundException,NoSuchMethodException,SecurityException{
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter class name : ");
		String className=sc.nextLine();
		Class<?> tempClass = Class.forName(className);
		
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
		Field[] declaredFields = tempClass.getDeclaredFields();
		for(Field x:declaredFields) {
			System.out.println(x);
		}
		
		TypeVariable<?>[] typeParameters = tempClass.getTypeParameters();	
		for(TypeVariable x: typeParameters) {
			System.out.println(x);
		}
	}
 
}