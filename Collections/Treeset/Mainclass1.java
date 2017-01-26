package com.jspider.collections.Treeset;


import java.util.TreeSet;

public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		System.out.println("program starts");
		
		Student s1=new Student(1111,"ajay", 82.1);
		Student s2=new Student(5555,"vijay", 92.1);
		Student s3=new Student(3333,"mahadev",75.00);
		Student s4=new Student(4444,"salman",71.98);
		
		
		TreeSet ts=new TreeSet();
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		for(Object obj:ts)
		{

			System.out.println(obj);
			
		}

		System.out.println("program ends");
		
		}

}
