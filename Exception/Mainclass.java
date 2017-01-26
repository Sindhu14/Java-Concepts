package com.jspider.Exception;

public class Mainclass {
	
	
	public void test1()
	{
		System.out.println("entering test1()");
		test2();
		System.out.println("exit fr0m test1()");
	}
	 public void test2()
	 {
		
		System.out.println("entering test2()");
		try
		{
		System.out.println("result"+10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("caught aritmatic exception");
		}
		System.out.println("exit from test2()");
	}
	
	public static void main(String[] args)
	{
	   System.out.println("program started..");
	   
	  Mainclass m1=new Mainclass();
	  m1.test1();
	  
		for(int i=0;i<10;i++)

		{
			System.out.println(i);
		}
		
         System.out.println("program ends");		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
