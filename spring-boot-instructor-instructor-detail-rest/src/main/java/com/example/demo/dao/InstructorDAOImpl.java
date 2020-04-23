package com.example.demo.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Instructor;

@Repository
public class InstructorDAOImpl implements InstructorDAO {
	
	private EntityManager entityManager;

	
	@Autowired
	public InstructorDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}


	@Override
	public Instructor createInstructor(Instructor instructor) {
		
		Session session = entityManager.unwrap(Session.class);
		session.save(instructor);
		return null;
	}



}
