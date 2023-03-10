package com.userservice.payload;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponse {
	
	private String message;
	private boolean status;
	private HttpStatus httpStatus;

}
