package com.aurionpro.test;

import com.aurionpro.model.DogDoor;
import com.aurionpro.model.Remote;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		
		System.out.println("Dog barks to go outside");
		remote.pressButton();
		System.out.println("Dog has gone outside");
		System.out.println("\nDog's all done");
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
		System.out.println("...But dog is stuck ouside!");
		System.out.println("\nDog starts barking");
		System.out.println("Person picks up remote");
		remote.pressButton();
		System.out.println("Dog is back inside");
		
//		System.out.println("Dog has finished playing");
//	
//		System.out.println("Dog came inside the house");
	}
}
