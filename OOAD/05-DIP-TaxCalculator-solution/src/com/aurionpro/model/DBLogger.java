package com.aurionpro.model;

public class DBLogger implements ILogger{
	@Override
	public void log(String err) {
		System.out.println("Logged to database : "+err);
	}
}
