package com.fannie.collections;

import java.util.HashSet;

public class CollectionEx04 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(); 
		
		set.add("Laptop"); 
		set.add("Mobile");

		set.add("Watch"); 
		set.add("Watch"); 
		
		
		
		System.out.println(set);
		set.remove("Watch"); 
		System.out.println(set);
	}
}
