package com.jspider.Exception;

public class Mainclass3 {

	public static void main(String[] args) {
		
		System.out.println("program started...");
		
		int num=10;
		int[] a1=new int[5];
		a1[0]=500;
		
		try
		{
			System.out.println("enerting outer try block");
			
			try
			
			{
				System.out.println("entering inner try block");
				System.out.println(a1[6]);
				System.out.println("exit from inner try block");
				
			}
			catch(ArrayIndexOutOfBoundsException aie)
			{
				System.out.println("executing inner catch block");
				System.out.println("caught ArrayIndexOutOfBoundsException");
			}
			
				System.out.println(num/0);
				System.out.println("exit from outer try");
				
		}
		     catch(ArithmeticException ae)
		     {
		    	 System.out.println("entering outer catch block");
		    	 System.out.println("caught ArithmaticException");
		     } 
		
	       System.out.println("program ends");
		
	}	
}

