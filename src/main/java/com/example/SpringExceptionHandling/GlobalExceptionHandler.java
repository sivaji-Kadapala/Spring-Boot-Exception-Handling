package com.example.SpringExceptionHandling;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler
	// Handle the exception
	public String handleAgeInvalidCase(AgeInvalidException exception) {
		return exception.getMessage();
	}
}
