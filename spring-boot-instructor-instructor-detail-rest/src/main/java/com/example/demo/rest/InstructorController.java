package com.example.demo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/instructor")
	public List<Instructor> getAllInstructor(){
		
		return instructorService.getAllInstructor();
	}
	
	@DeleteMapping("/instructor/{id}")
	public void deleteInstructor(@PathVariable int id) {
		instructorService.deleteInstructor(id);
	}
	

}
