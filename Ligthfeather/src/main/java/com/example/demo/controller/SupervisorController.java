package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Supervisor;

//Annotation
@RestController
public class SupervisorController {

	
	
	@GetMapping("/api/supervisors")
    public List<Object> getSupervisors()
    {
		

		String url = "https://o3m5qixdng.execute-api.us-east-1.amazonaws.com/api/managers";
		
		RestTemplate restTemplate = new RestTemplate();
		
		Supervisor[] supervisors = restTemplate.getForObject(url, Supervisor[].class);
		
		Comparator<Supervisor> byJurisdiction = Comparator.comparing(Supervisor::getJurisdiction);
		Comparator<Supervisor> byFirstname = Comparator.comparing(Supervisor::getFirstName);
		Comparator<Supervisor> byLastname = Comparator.comparing(Supervisor::getLastName);

		Arrays.sort(supervisors, byJurisdiction.thenComparing(byLastname).thenComparing(byFirstname));

		List<Supervisor> supervisorList = new LinkedList<>(Arrays.asList(supervisors));
		
		supervisorList.removeIf(n -> ("0".equals(n.getJurisdiction())));
		supervisorList.removeIf(n -> ("1".equals(n.getJurisdiction())));
		supervisorList.removeIf(n -> ("2".equals(n.getJurisdiction())));
		supervisorList.removeIf(n -> ("3".equals(n.getJurisdiction())));
		supervisorList.removeIf(n -> ("4".equals(n.getJurisdiction())));
		supervisorList.removeIf(n -> ("5".equals(n.getJurisdiction())));
		supervisorList.removeIf(n -> ("6".equals(n.getJurisdiction())));
		supervisorList.removeIf(n -> ("7".equals(n.getJurisdiction())));
		supervisorList.removeIf(n -> ("8".equals(n.getJurisdiction())));
		supervisorList.removeIf(n -> ("9".equals(n.getJurisdiction())));
		
		List<String> supervisorStringList = new LinkedList<>();
		
	      for (Iterator<Supervisor> i = supervisorList.iterator(); i.hasNext();) {
	          
	    	  String supervisor = "";
	    	  try {
	    	  supervisor = i.next().getJurisdiction() + " - " + i.next().getLastName() + ", " + i.next().getFirstName();
	    	  supervisorStringList.add(supervisor);
	    	  }catch(NoSuchElementException e) {}
	    	  
	    	  
	    	  //System.out.println(supervisor);
	       }
		

		Object[] supervisors2 = supervisorStringList.toArray();

		
        return Arrays.asList(supervisors2);

	
    }
	


}
