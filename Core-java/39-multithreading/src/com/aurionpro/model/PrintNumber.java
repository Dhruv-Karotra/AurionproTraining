package com.aurionpro.model;

public class PrintNumber extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName()+" : "+i);
		}
	}
	
}
