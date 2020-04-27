package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Instructor;

public interface InstructorService {
	
	public Instructor createInstructor(Instructor instructor);
	
	public List<Instructor> getAllInstructor();
	
	public void deleteInstructor(int id) ;

}
