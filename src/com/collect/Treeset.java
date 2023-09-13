package com.collect;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		System.out.println("Tree Set");
		System.out.println("**********");
		Set<Object> t=new TreeSet<Object>();
		t.add("Redhills");
		t.add("Perambur");
		t.add("Madhavaram");
		t.add("Rettari");
		t.add("Rettari");
		//t.add(52);
		//t.add(19);
		System.out.println("Treeset of Add:"+t);
		int o=t.size();
		System.out.println("Treeset Size:"+o);
		t.remove("Rettari");
		System.out.println("Treeset Removed:"+t);
		boolean r=t.contains("Perambur");
		System.out.println("Treeset Contains:"+r);
	
		
		
	}

}
