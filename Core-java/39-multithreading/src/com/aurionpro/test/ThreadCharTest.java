package com.aurionpro.test;

import com.aurionpro.model.PrintCharacter;

public class ThreadCharTest {

	public static void main(String[] args) {
		PrintCharacter obj=new PrintCharacter();
		Thread t1=new Thread(obj);
		t1.start();
		Thread t2=new Thread(obj);
		t2.start();
	}

}
