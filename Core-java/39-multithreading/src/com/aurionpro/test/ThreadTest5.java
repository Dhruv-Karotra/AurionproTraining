package com.aurionpro.test;

public class ThreadTest5 {
	
	static Object obj=new Object();

	public static void main(String[] args) {
		Runnable task = ()->{
			synchronized(args){

				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		for(int i=1;i<=10;i++) {
			String name="Thread "+i;
			Thread t1 = new Thread(task,name);
			t1.start();
		}

	}

}
