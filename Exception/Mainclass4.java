package com.jspider.Exception;

public class Mainclass4 {


	public void test()
	{
		System.out.println("executing test()");
	}
	public static void main(String[] args)
	{
      System.out.println("program started...");
		
		int num=10;
		int[] a1=new int[5];
		a1[0]=500;
		
		Mainclass4 ref1=null;
		
		try
		{
			System.out.println(a1[0]);
			System.out.println(num/2);
			ref1.test();
		}
		
		catch(Exception e)
		
		{
			e.printStackTrace();
			
		
		System.out.println("program ends");
	}
	}





}
