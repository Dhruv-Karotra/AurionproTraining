package com.aurionpro.test;
import com.aurionpro.models.IRepository;
import com.aurionpro.models.ProductRepository;

public class RepositoryTest {
	public static void main(String[] args) {
		ProductRepository repo=new ProductRepository();
		repo.create();
		repo.read();
		repo.update();
		repo.delete();
		
		repo.showGreetings();
		IRepository.printWelcomeMessage();
	}

}

// input - java.lang.String
//main methods 3 file -print fields
//		          -print methods
//	          -print constructors
// reflection api