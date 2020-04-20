package com.revature.rapp.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.rapp.exception.ResourceNotFoundException;
import com.revature.rapp.model.eventModel;
import com.revature.rapp.repositories.repoEvent;

@RestController
@RequestMapping("/events")
@CrossOrigin
public class eventcontroller {
	
	@Autowired
	private repoEvent repoEvent;
	

	@GetMapping("/all")
	public List<eventModel> getAllEvents() {
		System.out.println("it was here");
		return repoEvent.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<eventModel> getEventByID(@PathVariable(value = "id") int eventid) throws ResourceNotFoundException 
	{
		eventModel emodel = repoEvent.findById(eventid)
				.orElseThrow(() -> new ResourceNotFoundException("Event not found with this id: " + eventid));
			return ResponseEntity.ok().body(emodel);
		
	}
	
	
	@PostMapping("/create")
	public eventModel createEvent(@Valid @RequestBody eventModel emodel) {
		return repoEvent.save(emodel);
	}
	
	@GetMapping("/time/{timeval}")
	public String returnTimeWords(@PathVariable(value = "timeval") String strTime)
	{
		String strAnswer="";
		String strArr[]= strTime.split(":");	
		strAnswer = timetowords.timeInWords(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]));
       return strAnswer;
	}
	
//	@GetMapping("/{id}")
//	public Optional<eventModel> geteventById(@PathVariable("id") int id) {
//
//		return repoEvent.findById(id);
//	}
	
}
