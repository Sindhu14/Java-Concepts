package com.jspider.salman.collections;

public class Students implements Comparable{
	int id;
	String name;
	double marks;
	public Students(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public int compareTo(Object arg0)
	{
		Students st1=(Students)arg0;
		return this.name.compareTo(st1.name);//to sort by names;
		/*double ret=this.marks-st1.marks;
		if (ret>0) {
			
			return 1; //to sort by marks;
		}
		else if(ret<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}*/
		
		
	}
	
	

}
