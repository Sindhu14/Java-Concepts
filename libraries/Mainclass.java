package com.jspider.libraries;

public class Mainclass {

	public static void main(String[] args) {
		Object obj1=new Object();
		Object obj2=new Object();
		
		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
		
		System.out.println(obj2.toString());
		System.out.println(obj2.hashCode());
		
		System.out.println("comparing obj1 and obj2 using ="+obj1==obj2);
		System.out.println("comparing obj1 and obj2 using equals()"+obj1.equals(obj2));
	}

}
