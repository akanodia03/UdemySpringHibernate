package com.example.practice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UdemySpringHibernateApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(UdemySpringHibernateApplication.class, args);
		
		for(String string: applicationContext.getBeanDefinitionNames()) {
			
			System.out.println(string);
		}
	}
}
