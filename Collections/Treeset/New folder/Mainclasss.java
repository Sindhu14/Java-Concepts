package com.jspider.salman.collections;

import java.util.TreeSet;

public class Mainclasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program started...");
		
		Students s1=new Students(444, "A_salman", 85.00);
		Students s2=new Students(333, "D_taj",90.00);
		Students s3=new Students(111, "Khan", 100.00);
		Students s4=new Students(555, "Mahadev", 80.25);
		
		TreeSet t1=new TreeSet();
		
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		t1.add(s4);
		
		System.out.println(t1.size());

		
		for(Object obj:t1)
		{
			System.out.println(obj);
		}
		
		System.out.println("program ended");
	}

}
