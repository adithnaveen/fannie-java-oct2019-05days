package com.fannie.works;

public class Client2 {
	public static void main(String[] args) {
		Item [] items = new Item[5]; 
		
		
		items[0] = new Cake(101, "Honey", 4.55, 
				"Single", false, "Honey");
		
		items[1] = new Cake(102, "Red Velvet", 
				5.55, "Single", false, "Strawberry");
		
		items[2] = new Cookie(103, "Dark", 
				2.34, "Pack", true, new String[] {"Almonds"});
		
		items[3] = new Cake(104, "Honey", 
				4.55, "Single", false, "Honey");
		
		items[4] = new Cookie(105, "Milk", 
				4.34, "Pack", true, new String[] {"Almonds"});
		

		for(Item item : items) {
			Display.displayItem(item);
			System.out.println("--------------------------------");
		}
		
		
	}
}
