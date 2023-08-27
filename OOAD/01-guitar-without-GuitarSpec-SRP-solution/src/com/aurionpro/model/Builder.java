package com.aurionpro.model;

public enum Builder {
	FENDER,MARTIN,RYAN,OLSON;
	
	public String toString() {
		switch(this) {
		case FENDER : return "Fender";
		case MARTIN : return "Martin";
		case RYAN : return "Ryan";
		case OLSON : return "Olson";
		default : return "Invalid Type";
		}
	}
}
