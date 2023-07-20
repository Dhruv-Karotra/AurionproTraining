package com.aurionpro.models;

public class Boy implements IMannerable, IEmotionable{
	
	@Override
	public void wish() {
		System.out.println("Boy wishing");
	}
	
	@Override
	public void depart() {
		System.out.println("Boy departing");
	}
	
	@Override
	public void laugh() {
		System.out.println("Boy laughing");
	}
	
	@Override
	public void cry() {
		System.out.println("Boy crying");
	}

}
