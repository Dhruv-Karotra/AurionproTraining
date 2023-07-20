package com.aurionpro.models;

public class ClassifyPlayers{
	

	public Player[] getAListers(Player[] players) {
		int count=0;
		for(int i=0;i<players.length;i++) {
			if(players[i].getMatches()>100 && (players[i].getRuns()>5000 || players[i].getWickets()>150)) {
				count++;
			}
		}
		Player[] aListers=new Player[count];
		for(int i=0,j=0;i<players.length;i++) {
			if(players[i].getMatches()>100 && (players[i].getRuns()>5000 || players[i].getWickets()>150)) {
				aListers[j++]=players[i];
			}
		}
		return aListers;
	}
	
	public Player[] getBListers(Player[] players) {
		int count=0;
		for(int i=0;i<players.length;i++) {
			if(players[i].getMatches()>50 && (players[i].getRuns()>3000 || players[i].getWickets()>75)) {
				count++;
			}
		}
		Player[] bListers=new Player[count];
		for(int i=0,j=0;i<players.length;i++) {
			if(players[i].getMatches()>50 && (players[i].getRuns()>3000 || players[i].getWickets()>75)) {
				bListers[j++]=players[i];
			}
		}
		return bListers;
	}
	
	public Player[] getCListers(Player[] players) {
		int count=0;
		for(int i=0;i<players.length;i++) {
			if(players[i].getMatches()<50 && (players[i].getRuns()<3000 || players[i].getWickets()<75)) {
				count++;
			}
		}
		Player[] cListers=new Player[count];
		for(int i=0,j=0;i<players.length;i++) {
			if(players[i].getMatches()<50 && (players[i].getRuns()<3000 || players[i].getWickets()<75)) {
				cListers[j++]=players[i];
			}
		}
		return cListers;
	}

	

	
	
	
}
