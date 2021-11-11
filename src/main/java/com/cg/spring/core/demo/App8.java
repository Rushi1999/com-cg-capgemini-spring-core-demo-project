//inherit bean
package com.cg.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.core.demo.model.BeanPerson;
import com.cg.spring.core.demo.model.Employee;
 
public class App8 {
 
 	public static void main(String[] args) {
 
       	ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig2.xml");
 
       BeanPerson person = context.getBean("parentBean", BeanPerson.class);
       person.eat();
 
       	((AbstractApplicationContext) context).close();
 	}
}

