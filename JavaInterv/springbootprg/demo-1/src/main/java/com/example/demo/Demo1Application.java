package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Demo1Application.class, args);
		System.out.println("welcome boot");
		ConfigurableApplicationContext ac = SpringApplication.run(Demo1Application.class, args);
		Alien a = ac.getBean(Alien.class);
		a.m1();
	}

}
