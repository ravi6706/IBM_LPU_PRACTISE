package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Instructor;

public interface InstructorDAO {
	
	public Instructor createInstructor(Instructor instructor);
	
	public List<Instructor> getAllInstructor();
	
	public void deleteInstructor(int id) ;

}
