package com.cg.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.core.demo.model.Employee;

/**
 * 
 * @author Rushikesh Jankar Spring core demo project for CG trainees
 *
 */

public class App {

	public static void main(String[] args) {

		System.out.println("Start");

		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		

//		Employee emp = new Employee(1, "Rushi", 102.22);

		
		Employee emp = ctx.getBean("employee",Employee.class); // depemd on employee class // create diff obj for multiple bean
		System.out.println(emp.toString());
		
		Employee emp2 = ctx.getBean("employee2",Employee.class); // depemd on employee class 
		System.out.println(emp2.toString());
		
		((AbstractApplicationContext)ctx).close();

		System.out.println("End");
	}
}
