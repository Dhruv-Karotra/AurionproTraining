package com.aurionpro.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List guitars;
	
	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		Guitar guitar=new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for(Iterator i=guitars.iterator();i.hasNext();) {
			Guitar guitar=(Guitar) i.next();
			if(guitar.getSerialNumber().equals(serialNumber)) {
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
		List<Guitar> matchingGuitars=new LinkedList();
		for(Iterator i=guitars.iterator();i.hasNext();) {
			Guitar guitar=(Guitar) i.next();
			if(searchGuitar.getBuilder()!=guitar.getBuilder()) {continue;}
			String model=searchGuitar.getModel();
			if((model!=null) && (model.equals("")) && (!model.equalsIgnoreCase(guitar.getModel()))) {continue;}
			if(searchGuitar.getType()!=guitar.getType()) {continue;}
			if(searchGuitar.getBackWood()!=guitar.getBackWood()) {continue;}
			if(searchGuitar.getTopWood()!=guitar.getTopWood()) {continue;}
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}