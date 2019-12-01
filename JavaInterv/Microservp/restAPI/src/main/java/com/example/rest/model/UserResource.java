package com.example.rest.model;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	
	@Autowired
	UserService service;
	
	@PostMapping(value="/create")
	public User createUser(@Valid @RequestBody User user) {
		User newUser = service.createUser(user);
		return newUser;
	}
	
	@PostMapping(value="/createdStatus")
	public ResponseEntity<User> returnCreatedUser(@RequestBody User user) {
		User newUser = service.createUser(user);
		
		//CREATED
		//append the new user to the existing request. sothat can return in response body
		// /createdStatus/{id}-------newUser.getId()
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping(value="/get")
	public User createUser() {
		User user = null;
		if(user == null) {
		throw new UserNotFoudException("users not there.first create them");
		}
		return user;
	}
}
