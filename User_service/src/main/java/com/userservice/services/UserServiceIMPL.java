package com.userservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.userservice.entity.User;
import com.userservice.exceptions.ResourceNotFoundException;
import com.userservice.payload.ApiResponse;
import com.userservice.repo.UserRepo;

public class UserServiceIMPL implements UserServices {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public ResponseEntity<User> saveUser(User user) {
		User save = userRepo.save(user);
		
		return new ResponseEntity<User>(save,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ApiResponse> getUser(String userId) {
		// TODO Auto-generated method stub
		
		User orElseThrow = userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("user not found" + userId));
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setHttpStatus(ok);
		apiResponse.setMessage("ok");
		apiResponse.setStatus(true);
		
		return new ResponseEntity<ApiResponse>()
	}

	@Override
	public ResponseEntity<List<User>> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> deleteUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<User> updateUser(String userId, User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
