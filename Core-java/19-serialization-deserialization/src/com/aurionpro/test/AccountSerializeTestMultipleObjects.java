package com.aurionpro.test;
import com.aurionpro.models.Account;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AccountSerializeTestMultipleObjects {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  Account[] account = {new Account(101, "Dhruv", 100000),
       new Account(102, "Susminder", 200000)};
  
  try {
   FileOutputStream file = new FileOutputStream("D:\\serialize\\test1.txt");
   ObjectOutputStream out = new ObjectOutputStream(file);
   
   out.writeObject(account);
   
   out.close();
   file.close();
  }
  catch (FileNotFoundException e) {
   e.printStackTrace();
  }
  catch (IOException e) {
   e.printStackTrace();
  }
  
 }

}