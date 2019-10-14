package com.fannie.works;

public class Client1 {
	public static void main(String[] args) {
		Item cake1 = new Cake(101, "Red Velvet", 8.99, 
				"Single Cake", false, "StrawBerry");

		Item cookie = new Cookie(102, "Milk Chocolate", 4.56, 
				"Pack", true, new String[] {"Almonds", "Cashew"});
		
		
		Display.displayItem(cake1);
		System.out.println("---------------------");

		Display.displayItem(cookie);

	}
}
