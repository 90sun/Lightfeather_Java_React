package com.example.demo.controller;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.NumberInNameException;
import com.example.demo.exception.RequiredNotificationFieldNotfoundException;
import com.example.demo.model.Notification;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


//Annotation
@RestController
public class NotificationController {

	@PostMapping("/api/submit")
    public String newNotification(@RequestBody Notification newNotification)    {
		

	      if(newNotification.getFirstName() == null || newNotification.getLastName() == null || newNotification.getSupervisor() == null)throw new RequiredNotificationFieldNotfoundException();

	      char[] chars = newNotification.getFirstName().toCharArray();
	      StringBuilder sb = new StringBuilder();
	      for(char c : chars){
	         if(Character.isDigit(c))throw new NumberInNameException();
	      }
	      
	      chars = newNotification.getLastName().toCharArray();
	      sb = new StringBuilder();
	      for(char c : chars){
	         if(Character.isDigit(c))throw new NumberInNameException();
	      }
	      
		    
		    String firstName = newNotification.getFirstName(); 
		    String lastName = newNotification.getLastName(); 
		    String email = newNotification.getEmail(); 
		    String phoneNumber = newNotification.getPhoneNumber(); 
		    String supervisor = newNotification.getSupervisor(); 

		

		    
				return newNotification.printNotification();
			
    }
	
}
