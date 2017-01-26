package com.jspider.salman.collections;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Idcomparator implements Comparator
{
   public int compare(Object arg0,Object arg1)
   {
	   Student2 st1=(Student2) arg0;
	   Student2 st2=(Student2) arg1;
	   return st1.Id=st2.Id;
   }
}
 
  class Namecomparator implements Comparator
 {
	  public int compare(Object arg0,Object arg1)
	  {
		  Student2 st1=(Student2) arg0;
		   Student2 st2=(Student2) arg1;
		   return st1.name.compareTo(st2.name);
	  }
 }
  public class Mainclasss2
  {
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   
		Students s1=new Students(444, "salman", 85.00);
		Students s2=new Students(333, "taj",90.00);
		Students s3=new Students(111, "Khan", 100.00);
		Students s4=new Students(555, "Mahadev", 80.25);
		
		System.out.println("1:sort by names");
		System.out.println("2:sort by id");
		int choice=sc.nextInt();
		TreeSet ts=null;
		
		if(choice==1)
		{
		  	Namecomparator nc=new Namecomparator();
		  	ts=new TreeSet(nc);
		  	
		}
		if(choice==2)
		{
			Idcomparator ic=new Idcomparator();
			ts=new TreeSet(ic);
			
		}
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
   }

}