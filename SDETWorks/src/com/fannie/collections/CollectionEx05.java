package com.fannie.collections;

import java.util.Set;
import java.util.TreeSet;

public class CollectionEx05 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(); 
		
		set.add("Harry"); 
		set.add("Peter"); 
		set.add("Becky"); 
		set.add("Kanchan"); 
		
		System.out.println(set);
		
	}
}
