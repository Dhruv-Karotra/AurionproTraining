package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;
	
	public Inventory() {
		this.guitars = new ArrayList<>();
	}

	public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {
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
	
	public Guitar searchGuitar(Guitar searchGuitar) {	
		for(Guitar x : guitars) {
			String builder=searchGuitar.getBuilder();
			String model=searchGuitar.getModel();
			String type=searchGuitar.getType();
			String backWood=searchGuitar.getBackWood();
			String topWood=searchGuitar.getTopWood();
			if((builder.equals(x.getBuilder())) && 
					(model.equals(x.getModel())) &&
					(type.equals(x.getType())) &&
					(backWood.equals(x.getBackWood())) &&
					(topWood.equals(x.getTopWood()))) {
				return x;
			}
		}
		return null;
	}
}

