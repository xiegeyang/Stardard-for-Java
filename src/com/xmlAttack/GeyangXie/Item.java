package com.xmlAttack.GeyangXie;

public class Item {
	private String description;
	private double price;
	private String quantity;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public String toString(){
		return "Description : " + description + "\nprice : " + price +
				"\nquantity : " + quantity;
	}
}
