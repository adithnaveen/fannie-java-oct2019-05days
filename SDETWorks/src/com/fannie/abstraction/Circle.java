package com.fannie.abstraction;

public class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {

		System.out.println("Area of Circle " + 
				(3.14 * radius * radius));

	}

}
