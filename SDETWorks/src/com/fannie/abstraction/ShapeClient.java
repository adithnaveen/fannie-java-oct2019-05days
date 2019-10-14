package com.fannie.abstraction;

public class ShapeClient {
	public static void main(String[] args) {
		
		System.out.println(Shape.PI);
		
		Shape shapes [] = new Shape[5]; 
		
		shapes[0] = new Circle(2); 
		shapes[1] = new Circle(7); 
		shapes[2] = new Rectangle(3, 4);  
		shapes[3] = new Circle(5); 
		shapes[4] = new Rectangle(66, 2);
		
		for(Shape shape : shapes) {
			ShapeBL.display(shape); 
		}
		
	}
}
