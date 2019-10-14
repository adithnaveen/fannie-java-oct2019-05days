package com.fannie.collections;

import java.util.ArrayList;

public class CollectionEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		
		list.add(10); 
		list.add(23.4); 
		list.add("hello"); 
		list.add(new Object()); 
		list.add(true); 
		
		for(Object x : list) {
			System.out.println(x);
		}
		
		
	}
}
