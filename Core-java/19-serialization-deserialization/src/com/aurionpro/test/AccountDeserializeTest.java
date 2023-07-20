package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.models.Account;

public class AccountDeserializeTest {

	public static void main(String[] args) {
		
		try {
			FileInputStream file=new FileInputStream("D:\\serialize\\test.txt");
			ObjectInputStream in=new ObjectInputStream(file);
			Account acc=(Account)in.readObject();
			in.close();
			file.close();
			System.out.println(acc);
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
