package com.aurionpro.model;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	//private String allowedBark;
	private Bark allowedBark;

	public DogDoor() {
		this.open = false;
	}

	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
//	public String getAllowedBark() {
//		return allowedBark;
//	}
//	public void setAllowedBark(String allowedBark) {
//		this.allowedBark = allowedBark;
//	}
	public Bark getAllowedBark() {
		return allowedBark;
	}
	public void setAllowedBark(Bark allowedBark) {
		this.allowedBark = allowedBark;
	}

	public void open() {
		System.out.println("The door opens");
		open=true;
		
		final Timer timer=new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}
	
	public void close() {
		System.out.println("The door closes");
		open=false;
	}
}
