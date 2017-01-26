package com.jspider.collections.Treeset;
  
	public class Student implements Comparable
	{
		 int sid;
		 String name;
		 double marks;
		public Student(int sid, String name, double marks) {
			super();
			this.sid = sid;
			this.name = name;
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
		}
		
		public int compareTo(Object arg0)
		{
			Student st1=(Student)arg0;
			int ret=this.sid-st1.sid;
			return ret;
		}
		
		
		
	}
	
	

