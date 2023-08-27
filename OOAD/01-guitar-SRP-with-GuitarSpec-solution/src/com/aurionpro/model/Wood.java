package com.aurionpro.model;

public enum Wood {
	INDIAN_ROSEWOOD,ALDER,CEDAR,MAPLE,MAHOGANY;
	
	public String toString() {
		switch(this) {
		case INDIAN_ROSEWOOD : return "Indian Rosewood";
		case ALDER : return "Alder";
		case CEDAR : return "Cedar";
		case MAPLE : return "Maple";
		case MAHOGANY : return "Mahogany";
		default : return "Invalid Type";
		}
	}
}
