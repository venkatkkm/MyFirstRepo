package com.example.demo;

import org.springframework.stereotype.Component;

//@Component
@Component("lap1")
public class Laptop {

	private String name;
	private String ram;
	
	public String lap() {
		return "Laptop class method";
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
}
