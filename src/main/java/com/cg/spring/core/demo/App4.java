package com.cg.spring.core.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.cg.spring.core.demo.model.Employee3;

@Configuration
@ComponentScan
public class App4 {
 	public static void main(String[] args) {
       	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
       	ctx.register(Config.class);
       	ctx.refresh();
       	Employee3 emp = ctx.getBean(Employee3.class);
       	System.out.println(emp.toString());
//       	emp.work();
 	}
}


