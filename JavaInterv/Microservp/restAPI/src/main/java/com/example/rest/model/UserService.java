package com.example.rest.model;

import org.springframework.stereotype.Repository;

@Repository
public class UserService {
	
	public User createUser(User user) {
		return user;
	}

}
