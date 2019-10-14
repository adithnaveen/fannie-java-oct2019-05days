package com.fannie.works;

//by default the class becomes 
// the child of Object 
public class Cake extends Item{
	private String type; 
	private boolean isEggLess;
	private String flavour;
	

	public void mixIngrediants() {
		System.out.println("Anything with Egg is cake with Egg.. ");
	}

	
	public Cake(int id, String name, double price, String type, 
			boolean isEggLess, String flavour) {
		super(id, name, price);
		this.type = type;
		this.isEggLess = isEggLess;
		this.flavour = flavour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isEggLess() {
		return isEggLess;
	}
	public void setEggLess(boolean isEggLess) {
		this.isEggLess = isEggLess;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	@Override
	public String toString() {
		return super.toString() + "Cake [type=" + type + ", isEggLess=" + isEggLess + ", flavour=" + flavour + "]";
	} 
	
	
}
