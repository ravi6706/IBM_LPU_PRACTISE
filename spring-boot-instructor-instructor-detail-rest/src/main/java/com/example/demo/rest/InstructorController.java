package com.example.demo.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Instructor;
import com.example.demo.service.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorController {
	
	private InstructorService instructorService;

	public InstructorController(InstructorService instructorService) {
		super();
		this.instructorService = instructorService;
	}
	
	@PostMapping("/instructor")
	public Instructor createInstructor(@RequestBody Instructor instructor) {
		
		instructorService.createInstructor(instructor);
		return instructor;
		
	}
	

}
