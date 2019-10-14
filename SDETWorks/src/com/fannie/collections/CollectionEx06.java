package com.fannie.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CollectionEx06 {
	public static void main(String[] args) {
//		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		TreeMap<String, Integer> map = new TreeMap<String, Integer>(); 
		
		map.put("harry", 1000); 
		map.put("peter", 2000); 
		map.put("sunil", 3000); 
		
		System.out.println(map.get("harry"));
		
		map.put("harry", 4000); 
		
		System.out.println(map.get("harry"));
		
		
		Iterator itr = map.entrySet().iterator(); 
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> temp = 
						(Entry<String, Integer>) itr.next();
			
			System.out.println(temp.getKey() +", " + temp.getValue());
		}
		
		
	}
}
