package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.NotSerializableException;
import com.aurionpro.models.Account;

public class AccountSerializeTest {
	public static void main(String[] args) {
		Account acc = new Account(1, "Dhruv", 10000);

		try {
			FileOutputStream file = new FileOutputStream("D:\\serialize\\test.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(acc);
			out.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
