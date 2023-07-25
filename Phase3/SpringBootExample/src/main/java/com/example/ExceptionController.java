package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value=ProductException.class)
	public ResponseEntity<Object>exceptionHandler(ProductException e){
		return new ResponseEntity<>("Product Not Found",HttpStatus.NOT_FOUND);
	}
}
