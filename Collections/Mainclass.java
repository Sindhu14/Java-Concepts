package com.jspider.collections;

import java.util.ArrayList;

public class Mainclass 
{

	public static void main(String[] args)
	{
	Employee e1=new Employee(111,"AAA",1025.66);
	Employee e2=new Employee(222, "BBB", 5000);
	
	Student s1=new Student(1234,"salman", 82.1);
	Student s2=new Student(4567,"vijay", 92.1);
	
	ArrayList a1=new ArrayList();
	a1.add(e1);
	a1.add(e2);
	a1.add(s1);
	a1.add(s2);
	
	System.out.println("No of elements in list "+a1.size());
	for (int i = 0; i <a1.size(); i++) 
	{
		Object obj1=a1.get(i);
		
		if(obj1 instanceof Employee)
		{
			Employee et1=(Employee) obj1;
			double annualsalary=et1.salary*12;
			System.out.println("aanual salary of "+et1.name + "is" +annualsalary);
		}	
			else if(obj1 instanceof Student )
			{
				Student st1=(Student)obj1;
				System.out.println(st1.marks);
				
			}
			
		}

			
	}
}
