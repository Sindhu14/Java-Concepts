package com.jspider.collections;

public class Employee {
 int eid;
 String name;
 double salary;
public Employee(int eid, String name, double salary) {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
}
 
	
}
