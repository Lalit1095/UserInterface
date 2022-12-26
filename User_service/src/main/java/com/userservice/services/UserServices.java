package com.userservice.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.userservice.entity.User;

public interface UserServices {

	public ResponseEntity<User> saveUser(User user);
	
	public ResponseEntity<User> getUser(String userId);
	
	public ResponseEntity<List<User>> getAllUser();
	
	public ResponseEntity<String> deleteUser(String userId);
	
	public ResponseEntity<User> updateUser(String userId,User user);
}
