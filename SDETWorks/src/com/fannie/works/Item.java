package com.fannie.works;


//public, private, protected, default 


// to make the class encapsulated 
// have private variables, public methods, and 
// you dont have parametric constructor 
// this class is called as Java Bean Class 
public class Item {
	// instance variables 
	private int id; 
	private String name; 
	private double price;
	
	
	public Item() {}
	
	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() < 5 ) {
			System.out.println("Sorry Name cannot be less than 5 chars");
			this.name = "No Name"; 
		}else {
			this.name = name;
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}