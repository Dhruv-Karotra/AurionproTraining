package com.aurionpro.test;
import java.time.LocalDate;

import com.aurionpro.models.*;

public class VehicleInterfaceTest {

	public static void main(String[] args) {
		IMovable[] movable= {new Car("abcd",LocalDate.of(2021, 9, 23)),
							new Bike("xyz",LocalDate.of(2021, 05, 30)),
							new Bus("pqrs",LocalDate.of(2022, 02, 22))};
		
		for(IMovable x:movable) {
			startMoving(x);
		}

	}
	
	private static void startMoving(IMovable movable) {
		System.out.println(movable);
		Vehicle obj=(Vehicle)movable;
		obj.showTopSpeed();
	}

}
