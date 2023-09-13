package com.collect;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
public static void main(String[] args) {
	List<Object> k=new LinkedList<Object>();
	System.out.println("Linked List");
	System.out.println("*************");
    k.add("Laptop");
	k.add("Lenova");
	k.add(32000);
	k.add(2019);
	k.add(33221);
	System.out.println("LinkedList Add:"+k);
	k.set(2, 29000);
	System.out.println("LinkedList Set:"+k);
	int a=k.indexOf(2019);
	System.out.println("Intexof ArrayList:"+a);
	int n=k.size();
	System.out.println("Arraylist Size:"+n);
	//k.clear();
	//k.addAll(k);
	//k.retainAll(k);
	//k.removeAll(k );
	//System.out.println(n);
	//System.out.println(k.size());
	//System.out.println(k.get(2));
	//System.out.println(k.isEmpty());
	//System.out.println(k);
	//System.out.println(k.remove(3));
	//System.out.println(k.indexOf(3));
	System.out.println(k.contains(2022));
	//System.out.println(k);
	//System.out.println(k);
}
	
}
