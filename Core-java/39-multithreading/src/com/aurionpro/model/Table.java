package com.aurionpro.model;

public class Table implements Runnable {
	private int value;

	public Table(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(value + " * " + i + " = " + value * i);
			}
		}
	}

}
