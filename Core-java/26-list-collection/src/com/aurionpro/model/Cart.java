package com.aurionpro.model;

public class Cart {
	private String productName;
	private int quantity;
	private double price;
	private double totalProductPrice=1;
	public Cart(String productName, int quantity, double price) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.totalProductPrice=quantity*price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalProductPrice() {
		return totalProductPrice;
	}
	public void setTotalProductPrice(double totalProductPrice) {
		this.totalProductPrice = totalProductPrice;
	}
	@Override
	public String toString() {
		return "Cart [productName=" + productName + ", quantity=" + quantity + ", price=" + price
				+ ", totalProductPrice=" + totalProductPrice + "]";
	}
	
	
}
