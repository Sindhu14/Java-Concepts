package com.jspider.libraries;

public class Employee 
{
	int eid;
	String name;
    double salary;
public Employee(int eid, String name, double salary) 
 {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
  }
  
  public String toString()
  {
	  String info="ID "+this.eid+" name "+this.name+" salary "+this.salary;
	  return info;
  }
}

