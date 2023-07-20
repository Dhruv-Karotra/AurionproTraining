package com.aurionpro.test;

import com.aurionpro.models.*;

public class InterfaceTest {
	public static void main(String[] args) {
		Man man=new Man();
		Boy boy=new Boy();
		
		atTheMovies(man);                  //IMannerable obj=new Man();
		atTheMovies(boy);				   //IMannerable obj=new Boy();
		
		//atTheParty(man);         will not work because Man is not child of IEmotionable so cannot
		atTheParty(boy);			    	//IEmotionable obj=new Boy();

	}
	
	public static void atTheMovies(IMannerable obj) {
		obj.wish();
		obj.depart();
	}
	
	public static void atTheParty(IEmotionable obj) {
		obj.cry();
		obj.laugh();
	}
}
