package com.jspider.libraries;

public class Mainclass2 {

	public String toString()
	{
		return "overided toString()";
	}
	public int hashCode()
	{
		return 10;
	}
	public static void main(String[] args) {
	
     Mainclass2 m1=new Mainclass2();
     Mainclass2 m2=new Mainclass2();
     
     System.out.println(m1);
     System.out.println(m2);
     
     
	}
	

}
