package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.InstructorDAO;
import com.example.demo.entity.Instructor;

@Service
@EnableTransactionManagement
public class InstructorServiceImpl implements InstructorService{
	
	private InstructorDAO instructorDAO;
	
	@Autowired
	public InstructorServiceImpl(InstructorDAO instructorDAO) {
		super();
		this.instructorDAO = instructorDAO;
	}



	@Override
	@Transactional
	public Instructor createInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		return instructorDAO.createInstructor(instructor);
	}

}
