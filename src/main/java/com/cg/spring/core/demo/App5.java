package com.cg.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 import com.cg.spring.core.demo.model.Employee4;
 
public class App5 {
 
 	public static void main(String[] args) {
 
//     Employee obj = new Employee();
//     obj.work();
 
       ApplicationContext context = new  ClassPathXmlApplicationContext("SpringConfig.xml");
       Employee4 emp = context.getBean("employee3", Employee4.class);
       emp.work();
 	}
}
