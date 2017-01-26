package com.jspider.Exception;

public class mainclass2 {

		public void test1()
		{
			System.out.println("entering test1()");
			test2();
			System.out.println("exit fr0m test1()");
		}
		 public void test2()
		 {
			
			System.out.println("entering test2()");
			int[] a1=new int[5];
			a1[0]=5;
			try
			{
			System.out.println("result"+10/0);
			System.out.println(a1[7]);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("caught aritmatic exception");
				
			}
			catch(ArrayIndexOutOfBoundsException ai)
			{
				System.out.println("caught ArrayIndexOutOfBoundsException");
			}
			System.out.println("exit from test2()");
		}
		
		public static void main(String[] args)
		{
		   System.out.println("program started..");
		   
		  mainclass2 m1=new mainclass2();
		  m1.test1();
			for(int i=0;i<10;i++)

			{
				System.out.println(i);
			}
			
	         System.out.println("program ends");		
			
		  
	}

}
