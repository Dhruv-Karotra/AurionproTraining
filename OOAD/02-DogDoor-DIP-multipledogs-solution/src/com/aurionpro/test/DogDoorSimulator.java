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
		Bark bark=new Bark("Woof");
		//Bark bark=new Bark("Raullff");            // dog is not allowed
		
		System.out.println("Dog starts barking");
		//recognizer.recognize("Woof");
		recognizer.recognize(bark);
		System.out.println("\nDog has gone outside");
		System.out.println("\nDog's all done");
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
		
		System.out.println("But dog is stuck outside!");	
		System.out.println("Dog starts barking");
		//recognizer.recognize("Woof");
		recognizer.recognize(bark);
		
		System.out.println("\nDog is back inside");
			
		
	}
}
