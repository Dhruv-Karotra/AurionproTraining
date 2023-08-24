package com.aurionpro.model;

public class PrintCharacter implements Runnable {

	@Override
	public void run() {
		for(int i='A';i<'G';i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(Thread.currentThread().getName());
			System.out.println(" : "+(char)i);
		}
		
	}

}
