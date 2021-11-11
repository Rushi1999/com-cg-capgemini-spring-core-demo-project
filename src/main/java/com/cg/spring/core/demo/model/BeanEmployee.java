package com.cg.spring.core.demo.model;

import java.util.List;

public class BeanEmployee {
	private int id;
	private String name;
	private double salary;
	private List<String> dept;
	
	public BeanEmployee() {
		super();
		
	}
	
	public BeanEmployee(int id, String name, double salary, List<String> dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<String> getDept() {
		return dept;
	}
	public void setDept(List<String> dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "BeanEmployee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	

}
