package com.aurionpro.models;

public class ProductRepository implements IRepository{

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void read() {
		System.out.println("Reading products");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	public int printCategoriesCount(){
	//	categories=20;
		return categories;     //can be accessed but cannot be changed
	}
}
