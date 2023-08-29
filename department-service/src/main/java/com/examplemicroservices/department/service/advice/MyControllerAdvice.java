package com.examplemicroservices.department.service.advice;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.examplemicroservices.department.service.customexception.NullDepartmentException;

@ControllerAdvice
public class MyControllerAdvice {

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> nullDepartmentException(NullPointerException nullDept){
		return new ResponseEntity<String>("Department is null. Please check the user id", HttpStatus.NOT_FOUND);
	}
}
