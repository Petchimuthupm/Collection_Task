package com.collect;

import java.util.List;
import java.util.Vector;

public class Vector_List {
	public static void main(String[] args) {
		System.out.println("Vector List");
		System.out.println("************");
		List<Object> h=new Vector<Object>();
		h.add("TV");
		h.add("SAMSUNG");
		h.add(24000);
		h.add(2020);
		h.set(3, 2022);
		System.out.println("Vectorlist set:"+h);
		//int a=h.lastIndexOf(h);
		//int m=h.size();
		//h.clear();
	      h.addAll(h);
		//h.retainAll(h);   
		//h.removeAll(h );
		//System.out.println(m);
		System.out.println(h.size());
		//System.out.println(h.get(2));
		//System.out.println(h.isEmpty());
		//System.out.println(h);
		//System.out.println(h.remove(3));
		//System.out.println(h.indexOf(3));
		//System.out.println(h.contains(2022));
		//System.out.println(h);
		System.out.println(h);
	}

}
