package com.fannie.abstraction;


// access specifier -> public, private, protected, default 
// Access Modifier -> static, synchronised, abstract, final

public interface Shape {
	void area() ;
	
	double PI = 3.14; 
	
	// in interface you cannot have concrete methods 
//	public void write(){
//		System.out.println("you can draw with pen/pencil");
//	}
}
