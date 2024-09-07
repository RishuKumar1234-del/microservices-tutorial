package com.lcwd.userservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lcwd.userservice.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
//	@ExceptionHandler(ResourceNotfoundException.class)
//	public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotfoundException ex){
//		String message=ex.getMessage();
//	ApiResponse response	= ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
//		
//		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
		
		
//	}

}
