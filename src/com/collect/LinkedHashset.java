package com.collect;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {
	public static void main(String[] args) {
		System.out.println("Linked Hash Set");
		System.out.println("****************");
		Set<Object> l=new LinkedHashSet <Object>();
	    l.add(12345);
	    l.add(54321);
	    l.add("Welcome");
	    l.add("Welcome");
	    l.add("Windows");
	    l.add(2022);
	    System.out.println("Printinting Add:"+l);
		int m=l.size();
		System.out.println("LinledHashSet Size:"+m);
		l.remove(2022);
		System.out.println("Removed="+l);
		boolean n=l.contains("Windows");
		System.out.println("Contains Is:"+n);
	
	}

}
