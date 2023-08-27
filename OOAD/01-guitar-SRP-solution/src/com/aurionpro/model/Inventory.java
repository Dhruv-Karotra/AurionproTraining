package com.aurionpro.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List guitars;
	
	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		Guitar guitar=new Guitar(serialNumber,price,spec);
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
	
	public List searchGuitar(GuitarSpec searchSpec) {	
		List matchingGuitars=new LinkedList();
		for(Iterator i=guitars.iterator();i.hasNext();) {
			Guitar guitar=(Guitar)i.next();
			if(guitar.getSpec().matches(searchSpec)) {
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}
}

