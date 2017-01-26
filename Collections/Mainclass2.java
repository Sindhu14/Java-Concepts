package com.jspider.collections;

import java.util.HashSet;

public class Mainclass2 {

	public static void main(String[] args) {
		
		System.out.println("program starts");
		
		Student s1=new Student(1234,"salman", 82.1);
		Student s2=new Student(4567,"vijay", 92.1);
		
		HashSet hs=new HashSet();
		System.out.println(hs.add(s1));
		System.out.println(hs.add(s2));
		
		System.out.println(hs.size());
		System.out.println(hs.add(s1));
		System.out.println(hs.size());
		
		for(Object obj:hs)
		{
			System.out.println(obj);
			Student st1=(Student)obj;
			System.out.println(st1.marks);
		}
		
		System.out.println("program ends...");
	}
}

		

