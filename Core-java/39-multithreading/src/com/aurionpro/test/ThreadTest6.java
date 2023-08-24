package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest6{
	static Object obj=new Object();

	public static void main(String[] args) {
		Runnable task = () -> {
			synchronized(obj) {
				System.out.println(Thread.currentThread().getName());
				for(int i=1;i<=3;i++) {
					try {
						
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
		
		ExecutorService service=Executors.newFixedThreadPool(10);
		for(int i=1;i<10;i++) {
			service.execute(task);
		}

	}

}
