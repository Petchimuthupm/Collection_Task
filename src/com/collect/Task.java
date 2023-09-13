package com.collect;

public class Task {
	public static void main(String[] args) {
	
	String s="Welcome to the java";
	String s1="Welcome to the Java";
	String s2="Welcome to the world";
	//int i =s.length();
	boolean b=s.equals(s1);
	//System.out.println(b);
	boolean c=s.equalsIgnoreCase(s1);
	//System.out.println(c);
	String d=s1.toUpperCase();
	//System.out.println(d);
	String e=s.toLowerCase();
	//System.out.println(e);
	String f=s.substring(0, 7);
	System.out.println(f);
	String g=s1.trim();
	//System.out.println(g);
	boolean h=s.startsWith("e");
	//System.out.println(h);
	boolean j=s1.endsWith("a");
	//System.out.println(j);
	boolean k=s.contains("the");
	//System.out.println(k);
	int l=s1.indexOf("the");
	//System.out.println(l);
    int m=s1.lastIndexOf("e");
    //System.out.println(m);
    char o=s1.charAt(6);
    //System.out.println(o);
    String p=s.replace("the","my");
    //System.out.println(p);
    String q=s.substring(8);
    //System.out.println(q);
    boolean r=s2.isEmpty();
    //System.out.println(r);
    String t=s.concat(s1);
    //System.out.println(t);
    String y[] =s.split(" ");
    //f//or(int i=0;i <s.length();i++) {
   // System.out.println(y[i]);
    
	//}
	}
	}
