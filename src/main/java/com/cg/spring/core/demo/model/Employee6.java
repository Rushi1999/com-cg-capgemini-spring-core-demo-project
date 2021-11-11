package com.cg.spring.core.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component
public class Employee6 {
 
//   @Autowired
 	private Department2 department;
	public Object getDepartment;
 
//   public Employee() {
//     	super();
//     	System.out.println("default constructor");
//   }
 
//   @Autowired
 	public Employee6(Department2 department) {
       	super();
       	System.out.println("parameterized constructor");
       	this.department = department;
 	}
 
 	public Department2 getDepartment() {
       	return department;
 	}
 
//   @Autowired
 	public void setDepartment(Department2 department) {
       	System.out.println("setter method");
       	this.department = department;
 	}
}

