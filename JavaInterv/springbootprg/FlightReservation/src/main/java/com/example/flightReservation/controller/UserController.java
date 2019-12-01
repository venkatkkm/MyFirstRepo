package com.example.flightReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.flightReservation.model.User;
import com.example.flightReservation.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository useRepo;
	
	@Autowired
	private BCryptPasswordEncoder encode;

	@GetMapping("/showuser")
	public String regUserPage() {
		return "login/registerUser";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute("user") User user) {
		user.setPassword(encode.encode(user.getPassword()));
		useRepo.save(user);
		return "login/login";
	}
}
