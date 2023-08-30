package com.aurionpro.model;

public class Worker implements IWorker{
	@Override
	public void start() {
		System.out.println("Worker started working");
	}
	
	@Override
	public void stop() {
		System.out.println("Worker stopped working");
	}
	
	@Override
	public void eat() {
		System.out.println("Worker started eating");
	}
	
	@Override
	public void rest() {
		System.out.println("Worker started resting");
	}
}
