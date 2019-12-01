package com.student.ete.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/hello")
	public String getHello() {
		return "helloWorld";
	}
}
