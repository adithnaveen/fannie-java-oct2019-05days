package com.fannie.works;

// BL class 
public class Display {
	public static void displayItem(Item item) {
		System.out.println(item);

		if (item instanceof Cake) {
			((Cake) item).mixIngrediants();
		}else if (item instanceof Cookie) {
			((Cookie) item).makeCookie();
		}
	}
}
