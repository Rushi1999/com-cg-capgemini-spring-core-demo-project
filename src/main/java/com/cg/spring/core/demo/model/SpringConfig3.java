package com.cg.spring.core.demo.model;

import org.springframework.context.annotation.Bean;
 
public class SpringConfig3 {
 
 	@Bean
 	public Employee employee() {
       	System.out.println("Employee bean");
       	return new Employee();
 	}
}




