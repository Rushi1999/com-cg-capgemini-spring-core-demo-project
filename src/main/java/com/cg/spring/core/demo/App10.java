package com.cg.spring.core.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.cg.spring.core.demo.model.Department2;
 
@ComponentScan
public class App10 {
 	public static void main(String[] args) {
       	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
//       	Employee6 emp = ctx.getBean(Employee6.class);
//       	emp.getDepartment.work();
       	
       	Department2 dept = ctx.getBean(Department2.class);
        dept.work();
 	}
}
