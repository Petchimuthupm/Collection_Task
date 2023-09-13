package com.collect;

import java.util.ArrayList;
import java.util.List;

public class Collection_task {
	
	public static void main(String[] args) {
		List<Object> r=new ArrayList<Object>();
		System.out.println("Array List");
		System.out.println("***********");
		r.add("Mobiles");
		r.add("Vivo Z1 Pro");
		r.add(1001);
		r.add(2022);
		r.set(2, 999);
		System.out.println("Arraylist Set:"+r);
		int a=r.hashCode();
		System.out.println("Hashcode:"+a);
		int c=r.size();
		//r.clear();
		//r.addAll(r);
		r.retainAll(r);
		//r.removeAll(r);
		System.out.println("ArrayList Size:"+c);
		//System.out.println(r.size());
		System.out.println(r.get(2));
		//System.out.println(r.isEmpty());
		//System.out.println(r);
		//System.out.println(r.remove(3));
		//System.out.println(r.indexOf(3));
		//System.out.println(r.contains(999));
		//System.out.println(r);
		System.out.println(r);
	}


}
