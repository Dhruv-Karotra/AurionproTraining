package com.aurionpro.model;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private int id;
	private LocalDate date;
	private List<LineItem> itemList;
	public Order(int id, LocalDate date, List<LineItem> items) {
		super();
		this.id = id;
		this.date = date;
		this.itemList = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<LineItem> getItems() {
		return itemList;
	}
	public void setItems(List<LineItem> items) {
		this.itemList = items;
	}
	
	public double calculateOrderPrice() {
		double orderPrice = 0;
        for (LineItem x : itemList) {
            orderPrice += x.calculateLineItemCost();
        }
        return orderPrice;
	}
	
	public void addLineItem(LineItem lineItem) {
		itemList.add(lineItem);
    }
	 
	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", itemList=" + itemList + "]";
	}
	
	
}
