package com.aurionpro.models;

public class Time {
	private int hours;
	private int mins;
	private int seconds;
	
	public Time(int hours, int mins, int seconds) {
		super();
		this.hours = hours;
		this.mins = mins;
		this.seconds = seconds;
	}
	
	

	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) {
		this.mins = mins;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", mins=" + mins + ", seconds=" + seconds + "]";
	}
	
	
	
}
