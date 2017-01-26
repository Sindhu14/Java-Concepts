package com.jspider.salman.collections;

import java.util.Comparator;

public class Student2 {
  int Id;
  String name;
  double marks;
public Student2(int sid, String name, double marks) {
	super();
	this.Id = sid;
	this.name = name;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student2 [sid=" + Id + ", name=" + name + ", marks=" + marks + "]";
  }
}
 
  