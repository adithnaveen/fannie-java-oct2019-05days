package com.fannie.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx02 {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>(); 
		
		
		System.out.println("Size : " + list.size());
		list.add("Harry"); 
		list.add("Peter"); 
		list.add("Becky"); 
		list.add("William"); 
		
		System.out.println(list);
		System.out.println("After adding size " + list.size());
		
		list.remove(0); 
		System.out.println(list);
		
		list.add(2, "Sachin");
		System.out.println(list);
		
		for(String temp : list) {
			System.out.println(temp.toUpperCase());
		}
		System.out.println("-------------------------------");
		
		List<String> list2 = list.subList(1, list.size()); 
		 System.out.println(list2); 
		
		
	}
}
