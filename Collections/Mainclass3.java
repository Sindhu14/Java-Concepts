package com.jspider.collections;

import java.util.LinkedHashSet;

public class Mainclass3 {

	public static void main(String[] args) {
	

		System.out.println("program starts");
		
		Student s1=new Student(1234,"ajay", 82.1);
		Student s2=new Student(4567,"vijay", 92.1);
		Student s3=new Student(1111,"mahadev",75.00);
		Student s4=new Student(2222,"salman",71.98);
		
		
		LinkedHashSet ls=new LinkedHashSet();
		
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		
		for(Object obj:ls)
		{

			System.out.println(obj);
			Student st1=(Student)obj;
			System.out.println(st1.marks);
		
		}

		System.out.println("program ends");
		
	}

}
