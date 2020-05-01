package com.revature.rapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.rapp.exception.ResourceNotFoundException;
import com.revature.rapp.model.EventModel;
import com.revature.rapp.repositories.RepoEvent;

@RestController
@RequestMapping("/events")
@CrossOrigin
public class EventController {
	
	@Autowired
	private RepoEvent repoEvent;
	

	@GetMapping("/all")
	public List<EventModel> getAllEvents() {
		return repoEvent.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EventModel> getEventByID(@PathVariable(value = "id") int eventid) throws ResourceNotFoundException 
	{
		EventModel emodel = repoEvent.findById(eventid)
				.orElseThrow(() -> new ResourceNotFoundException("Event not found with this id: " + eventid));
			return ResponseEntity.ok().body(emodel);
	}
	
	@PostMapping("/create")
	public EventModel createEvent(@Valid @RequestBody EventModel emodel) {
		return repoEvent.save(emodel);
	}
	
	@GetMapping("/time/{timeval}")
	public String returnTimeWords(@PathVariable(value = "timeval") String strTime)
	{
		String strAnswer="";
		String strArr[]= strTime.split(":");	
		strAnswer = TimeToWords.timeInWords(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]));

       return strAnswer;
	}
	
	
}
