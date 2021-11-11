package com.cg.spring.core.demo;

import org.springframework.context.annotation.Bean;

//import com.cg.spring.core.demo.model.Employee2;

import com.cg.spring.core.demo.model.Employee3;

public class Config {

	@Bean
//	public Employee2 employee2() {
//
//		return new Employee2();
//		return new Employee2(101, "Sonu", 10.25);
//	}
	
	public Employee3 employee3() {

//		return new Employee2();
		return new Employee3(101, "Sonu", 10.25);
	}

}