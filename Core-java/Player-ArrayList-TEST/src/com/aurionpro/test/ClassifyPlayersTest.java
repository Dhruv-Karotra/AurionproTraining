package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.ClassifyPlayers;
import com.aurionpro.model.Players;

public class ClassifyPlayersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players[] player = {
				new ClassifyPlayers(1, "Dhruv", 200, 6000, 200),
				new ClassifyPlayers(2, "Susminder", 49, 2500, 65),
				new ClassifyPlayers(3, "Aniket", 90, 6000, 200),
				new ClassifyPlayers(4, "Nikul", 10, 6000, 200),
				new ClassifyPlayers(5, "Rajesh", 20, 6000, 200),
				new ClassifyPlayers(6, "Pankaj", 300, 6000, 200),
				new ClassifyPlayers(7, "Jigna", 300, 6000, 76),
				new ClassifyPlayers(8, "Kalavantiiii", 60, 6000, 76),

				
		};
		List<Players> Aresults= new ArrayList<Players>();
		Aresults = 	ClassifyPlayers.getAListers(player);
		for (int i = 0; i < Aresults.size(); i++) {
			System.out.println(Aresults.get(i));
		}
		System.out.println("====================");
		List<Players> Bresults= new ArrayList<Players>();
		Bresults = 	ClassifyPlayers.getBListers(player);
		for (int i = 0; i < Bresults.size(); i++) {
			System.out.println(Bresults.get(i));
		}
		System.out.println("====================");
		List<Players> Cresults= new ArrayList<Players>();
		Cresults = 	ClassifyPlayers.getCListers(player);
		for (int i = 0; i < Cresults.size(); i++) {
			System.out.println(Cresults.get(i));
		}
	}

}