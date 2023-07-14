package com.script.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.script.exception.ApplicationException;
import com.script.exception.UserInputException;


@RestControllerAdvice
public class ApplicationExceptionHandler 

    {

	@ExceptionHandler(UserInputException.class)
	public ResponseEntity<String> handleUserInputException(UserInputException exception){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
	}

	@ExceptionHandler(ApplicationException.class)
	public ResponseEntity<String> handleApplicationException(ApplicationException exception){
		
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(ApplicationException exception){
		
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
	}

}
