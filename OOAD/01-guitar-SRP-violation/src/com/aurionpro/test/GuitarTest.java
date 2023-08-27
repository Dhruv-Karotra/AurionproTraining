package com.aurionpro.test;

import com.aurionpro.model.Guitar;
import com.aurionpro.model.Inventory;

public class GuitarTest {
	public static void main(String[] args) {
		Inventory inv=new Inventory();
		initializeInventory(inv);
		Guitar likedGuitar= new Guitar("",0,"fender","Stratocastor","Electric","Alder","Alder");
		
		Guitar guitar=inv.searchGuitar(likedGuitar);
		inv.searchGuitar(likedGuitar);
		if(guitar!=null) {
			System.out.println("Guitar found");
			System.out.println("You might like : ");
			System.out.println(guitar.getBuilder()+" "+guitar.getModel()+" "+guitar.getType()+" "
					+guitar.getBackWood()+" back and sides "+ guitar.getTopWood()+" top.");
			System.out.print(" You can have it for only $ "+guitar.getPrice());
		}
		else {
			System.out.println("Sorry liked guitar not found");
		}
	}
	
	private static void initializeInventory(Inventory inv) {
		inv.addGuitar("101",2000,"fender","Stratocastor","Electric","Alder","Alder");
		inv.addGuitar("V95693",1500,"fender","Stratocastor","Electric","Alder","Alder");
	}
}
