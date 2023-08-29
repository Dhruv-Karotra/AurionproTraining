package com.aurionpro.model;

public class DogDoor {
	private boolean open;

	public DogDoor() {
		this.open = false;
	}

	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public void open() {
		System.out.println("The door opens\n");
		open=true;
	}
	
	public void close() {
		System.out.println("The door closes\n");
		open=false;
	}
}
