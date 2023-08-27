package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Builder;
import com.aurionpro.model.Guitar;
import com.aurionpro.model.Inventory;
import com.aurionpro.model.Type;
import com.aurionpro.model.Wood;

public class GuitarTest {
	public static void main(String[] args) {
		Inventory inv=new Inventory();
		initializeInventory(inv);
		Guitar likedGuitar= new Guitar("",0,Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
		
		//Guitar guitar=inv.searchGuitar(likedGuitar);
		List<Guitar> guitar=inv.searchGuitar(likedGuitar);
		inv.searchGuitar(likedGuitar);
		if(guitar!=null) {
			System.out.println("Guitar found");
			System.out.println("You might like : ");
			for(Guitar x : guitar) {
				System.out.print(x.getBuilder()+" "+x.getModel()+" "+x.getType()+" "
						+x.getBackWood()+" back and sides "+ x.getTopWood()+" top.");
				System.out.print(" You can have it for only $ "+x.getPrice()+"\n");
			}
			
		}
		else {
			System.out.println("Sorry liked guitar not found");
		}
	}
	
	private static void initializeInventory(Inventory inv) {
		inv.addGuitar("V2",2000,Builder.FENDER,"Strato",Type.ACOUSTIC,Wood.ALDER,Wood.ALDER);
		inv.addGuitar("V3",2300,Builder.FENDER,"Strato",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
		inv.addGuitar("V4",1500,Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
		inv.addGuitar("V5",1300,Builder.RYAN,"Strato",Type.ELECTRIC,Wood.CEDAR,Wood.ALDER);
		inv.addGuitar("V6",2100,Builder.FENDER,"Strato",Type.ACOUSTIC,Wood.MAPLE,Wood.ALDER);
	}
}
