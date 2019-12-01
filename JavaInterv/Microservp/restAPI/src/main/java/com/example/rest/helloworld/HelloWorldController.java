package com.example.rest.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value="/wish")
	public String getMSg() {
		return "hello world!!";
	}
	
	@GetMapping(value="/bean")
	public WelcomeBean getBean() {
		return new WelcomeBean("HelloWorldBeanMsg");
	}
	
	@GetMapping(value="bean/{name}")
	public WelcomeBean getBeanPathVariable(@PathVariable("name") String name) {
		return new WelcomeBean(String.format("Welcome to my World, %s",name));
		//return new WelcomeBean("Hello "+name);
	}
}
