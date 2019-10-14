package com.fannie.collections;

import java.util.Vector;

public class CollectionEx03 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(); 
		
		
		System.out.println("Number of Elements " + vector.size());
		System.out.println("Number of Element Reserved " + vector.capacity());
		

		vector.add("One"); 
		vector.add("Two"); 
		vector.add("Three"); 
		
		vector.add("One"); 
		vector.add("Two"); 
		vector.add("Three"); 
		

		vector.add("One"); 
		vector.add("Two"); 
		vector.add("Three"); 
		
		vector.add("One"); 
		vector.add("Two"); 

		
		System.out.println("After Adding -> Number of Elements " + vector.size());
		System.out.println("After Adding -> Number of Element Reserved " + vector.capacity());
		
		
	}
}
