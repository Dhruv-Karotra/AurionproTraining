package com.aurionpro.model;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BarkRecognizer{
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}
	
	public void recognize(Bark bark) { 
		System.out.println("BarkRecognizer : Heard a '"+bark.getSound() +"'");
		List allowedBarksList=convertSetToList(door.getAllowedBarks());
		for(Iterator i=allowedBarksList.iterator();i.hasNext();) {
			Bark allowedBark=(Bark) i.next();
			if(allowedBarksList != null && allowedBark.equals(bark)) {	
				door.open();
				return;
			}
		}
		System.out.println("This dog is "+" not allowed");
	}
	
	public static <T> List<T> convertSetToList(Set<T> set)
    {
        return set.stream()
        		  .collect(Collectors.toList());
    }
	
}
