package com.collect;

import java.util.HashSet;
import java.util.Set;

public class Set_task {
	public static void main(String[] args) {
		System.out.println("Hashset-Linkedset-Treeset");
		System.out.println("*************************");
		Set<Object> a=new HashSet <Object>();
		a.add("Oops");
		a.add("Class");
		a.add("Method");
		a.add("Object");
		a.add(4);
		a.add(2022);
		a.add("Oops");
		System.out.println("Add Value Is:"+a);
		int b=a.size();
		System.out.println("Size of Hashset:"+b);
		boolean c=a.remove("Object");
		System.out.println("Removed="+c);
		boolean d=a.contains("Method");
		//System.out.println(a);
		System.out.println("Contains="+d);
		//a.addAll(a);
		System.out.println(a.addAll(a));
		//System.out.println("Add All="+a);
		a.retainAll(a);
		System.out.println("Retain All"+a);
		a.removeAll(a);
		System.out.println("Removed All the Collection:"+a);
	}

}
