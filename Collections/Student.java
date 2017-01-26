package com.jspider.collections;

public class Student {
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
 
	
	
	
}
