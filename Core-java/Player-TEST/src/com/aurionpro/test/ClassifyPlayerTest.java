package com.aurionpro.test;
import com.aurionpro.models.*;

public class ClassifyPlayerTest {

	public static void main(String[] args) {
		Player[] players= {new Player(200,"Dhruv",100,4000,200),
						  new Player(2,"Susminder",1,55,5)
		};
		ClassifyPlayers objA=new ClassifyPlayers();
		ClassifyPlayers objB=new ClassifyPlayers();
		ClassifyPlayers objC=new ClassifyPlayers();
		System.out.println("A Listers");
		Player[] aListers=objA.getAListers(players);
		for(Player x:aListers) {
			System.out.println(x);
		}
		System.out.println("B Listers");
		Player[] bListers=objB.getBListers(players);
		for(Player x:bListers) {
			System.out.println(x);
		}
		System.out.println("C Listers");
		Player[] cListers=objC.getCListers(players);
		for(Player x:cListers) {
			System.out.println(x);
		}
	}

	


}
