package com.aurionpro.test;

import java.util.Iterator;
import java.util.List;

import com.aurionpro.model.Builder;
import com.aurionpro.model.Guitar;
import com.aurionpro.model.GuitarSpec;
import com.aurionpro.model.Inventory;
import com.aurionpro.model.Type;
import com.aurionpro.model.Wood;

public class GuitarTest {
	public static void main(String[] args) {
		Inventory inv=new Inventory();
		initializeInventory(inv);
		GuitarSpec likedGuitar= new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
		
		//Guitar guitar=inv.searchGuitar(likedGuitar);
		List matchingGuitars=inv.searchGuitar(likedGuitar);
		inv.searchGuitar(likedGuitar);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Guitar found");
			System.out.println("You might like : ");
			for(Iterator i=matchingGuitars.iterator();i.hasNext();) {
				Guitar guitar=(Guitar) i.next();
				GuitarSpec spec=guitar.getSpec();
				System.out.print(spec.getBuilder()+" "+spec.getModel()+" "+spec.getType()+" "
						+spec.getBackWood()+" back and sides "+ spec.getTopWood()+" top.");
				System.out.print(" You can have it for only $ "+guitar.getPrice()+"\n");
				System.out.println("---------------------------------------");
			}
		}
		else {
			System.out.println("Sorry liked guitar not found");
		}
	}
	
	private static void initializeInventory(Inventory inv) {
		inv.addGuitar("V2",2000,new GuitarSpec(Builder.FENDER,"Strato",Type.ACOUSTIC,Wood.ALDER,Wood.ALDER));
		inv.addGuitar("V3",2300,new GuitarSpec(Builder.FENDER,"Strato",Type.ELECTRIC,Wood.ALDER,Wood.ALDER));
		inv.addGuitar("V4",1500,new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER));
		inv.addGuitar("V5",1300,new GuitarSpec(Builder.RYAN,"Strato",Type.ELECTRIC,Wood.CEDAR,Wood.ALDER));
		inv.addGuitar("V6",2100,new GuitarSpec(Builder.FENDER,"Strato",Type.ACOUSTIC,Wood.MAPLE,Wood.ALDER));
	}
}
