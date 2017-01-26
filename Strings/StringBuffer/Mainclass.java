package com.jspider.StringBuffer;

public class Mainclass {

	public static void main(String[] args) {
		
		System.out.println("program started..");
		
		StringBuffer sb=new StringBuffer("java");
		StringBuffer sb2=new StringBuffer("java");
		
		System.out.println(sb.append("developer"));
		System.out.println(sb.length());
		System.out.println(sb.insert(1, "jjjjjjjj"));
		System.out.println(sb.reverse());
		
		System.out.println(sb.toString());
		
		System.out.println(sb.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb.equals(sb2));
		
		
		System.out.println("program ends");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
