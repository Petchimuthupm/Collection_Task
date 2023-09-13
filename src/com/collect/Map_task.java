package com.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_task {

	public static void main(String[] args) {
		System.out.println("Welcome to Map");
		System.out.println("***************");
		Map <Integer,String>h =new HashMap <Integer,String>();
		h.put(5, "Tamil");
		h.put(2, "English");
		h.put(5, "Tamil");
		h.put(4, "Malayalam");
		h.put(3, null);
		System.out.println("Printing Map of Put:"+h);
		int k=h.size();
		System.out.println("Map Size:"+k);
		String m=h.get(2);
		System.out.println("Map Get:"+m);
		Set<Integer>y=h.keySet();
		System.out.println("Map Keyset:"+y);
		boolean n=h.containsKey(5);
		System.out.println("Map ContainsKey:"+n);
		boolean g=h.containsValue("Hindi");
		System.out.println("Map ContainsValue:"+g);
		Set<Entry<Integer, String>> x=h.entrySet();
		System.out.println("Map Entryset:"+x);
		
	}
}
