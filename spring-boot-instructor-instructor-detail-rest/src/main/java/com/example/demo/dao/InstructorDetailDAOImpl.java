package com.example.demo.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;

@Repository
public class InstructorDetailDAOImpl implements InstructorDetailDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public InstructorDetailDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}



	@Override
	public InstructorDetail createInstructorDetail(InstructorDetail instructorDetail) {
		Session session = entityManager.unwrap(Session.class);
		Instructor instructor = instructorDetail.getInstructor();
		instructor.setInstructorDetail(instructorDetail);
		session.save(instructor);
		return instructorDetail;
	}

}
