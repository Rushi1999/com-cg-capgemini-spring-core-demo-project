//java based config
package com.cg.spring.core.demo;

	
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	import org.springframework.context.support.AbstractApplicationContext;
	import com.cg.spring.core.demo.model.*;
	 
	/**
	 *
	 * @author Rushikesh jankar
	 *
	 */
	 
	public class App9 {
	 
	 	public static void main(String[] args) {
	       	System.out.println("Start");
	       	ApplicationContext ctx = new	AnnotationConfigApplicationContext(SpringConfig3.class);
	 
	       	Employee4 emp = ctx.getBean(Employee4.class);
	       	emp.work();
	       	System.out.println("End");
	       	((AbstractApplicationContext) ctx).close();
	 	}


}
