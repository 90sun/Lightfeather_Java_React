package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NotificationExceptionController {
	
  @ExceptionHandler(value = RequiredNotificationFieldNotfoundException.class)
   public ResponseEntity<Object> exception(RequiredNotificationFieldNotfoundException exception) {
	      return new ResponseEntity<>("Required Field Not Found", HttpStatus.NOT_FOUND);
	   }
  
  
  @ExceptionHandler(value = NumberInNameException.class)
  public ResponseEntity<Object> exception(NumberInNameException exception) {
	      return new ResponseEntity<>("Number In Name Found", HttpStatus.NOT_ACCEPTABLE);
	   }
	}