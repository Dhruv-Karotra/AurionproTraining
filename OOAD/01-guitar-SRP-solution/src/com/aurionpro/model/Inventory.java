package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;
	
	public Inventory() {
		this.guitars = new ArrayList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		Guitar guitar=new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
		guitars.add(guitar);
		System.out.println(guitars);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for(Guitar x : guitars) {
			if(x.getSerialNumber().equals(serialNumber)) {
				Guitar guitar=x;
				return guitar;
			}
		}
		return null;
	}
	
//	public Guitar searchGuitar(Guitar searchGuitar) {	
//		for(Guitar x : guitars) {
//			if(searchGuitar.getBuilder()!=x.getBuilder()) {continue;}
//			String model=searchGuitar.getModel();
//			if((model!=null) && (model.equals("")) && (!model.equalsIgnoreCase(x.getModel()))) {continue;}
//			if(searchGuitar.getType()!=x.getType()) {continue;}
//			if(searchGuitar.getBackWood()!=x.getBackWood()) {continue;}
//			if(searchGuitar.getTopWood()!=x.getTopWood()) {continue;}
//			return x;
//		}
//		return null;
//	}
	
	public List<Guitar> searchGuitar(Guitar searchGuitar) {	
		List<Guitar> matchingGuitars=new ArrayList<>();
		for(Guitar x : guitars) {
			if(searchGuitar.getBuilder()!=x.getBuilder()) {continue;}
			String model=searchGuitar.getModel();
			if((model!=null) && (model.equals("")) && (!model.equalsIgnoreCase(x.getModel()))) {continue;}
			if(searchGuitar.getType()!=x.getType()) {continue;}
			if(searchGuitar.getBackWood()!=x.getBackWood()) {continue;}
			if(searchGuitar.getTopWood()!=x.getTopWood()) {continue;}
			matchingGuitars.add(x);
		}
		return matchingGuitars;
	}
}

