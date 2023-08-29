package com.aurionpro.test;

import com.aurionpro.model.Bark;
import com.aurionpro.model.BarkRecognizer;
import com.aurionpro.model.DogDoor;
import com.aurionpro.model.Remote;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door=new DogDoor();
		BarkRecognizer recognizer=new BarkRecognizer(door);
		Remote remote=new Remote(door);
		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("rooooowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("Woof"));
		
		System.out.println(door.getAllowedBarks());	
		System.out.println("Bruce starts barking");
		recognizer.recognize(new Bark("rowlf"));
		System.out.println("\nBruce has gone outside");
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
		
		System.out.println("\nBruce's all done");
		System.out.println("But Bruce is stuck outside!");	
		
		Bark smallDogBark=new Bark("yip");
		System.out.println("A small dog starts barking");
		recognizer.recognize(smallDogBark);
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
		
		System.out.println("Bruce starts barking");
		recognizer.recognize(new Bark("Woof"));
		
		System.out.println("\nBruce is back inside");
	}
}
