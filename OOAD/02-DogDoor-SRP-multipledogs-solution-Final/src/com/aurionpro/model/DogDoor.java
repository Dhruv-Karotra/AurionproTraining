package com.aurionpro.model;

import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor{
	private boolean open;
	//private String allowedBark;
	private Set<Bark> allowedBarks;

	public DogDoor() {
		this.open = false;
		this.allowedBarks=new HashSet<>();
	}
	
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public Set<Bark> getAllowedBarks() {
		return allowedBarks;
	}
	public void setAllowedBarks(Set<Bark> allowedBarks) {
		this.allowedBarks = allowedBarks;
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

	public void addAllowedBark(Bark bark) {
		allowedBarks.add(bark);
	}

	@Override
	public String toString() {
		return "DogDoor [open=" + open + ", allowedBarks=" + allowedBarks + "]";
	}
	
	
}
