package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
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


	@Override
	public List<Instructor> getAllInstructor() {
		Session session = entityManager.unwrap(Session.class);
		Query<Instructor> query = session.createQuery("from Instructor", Instructor.class);
		List<Instructor> instructors = query.getResultList();
		return instructors;
	}


	@Override
	public void deleteInstructor(int id) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("delete from Instructor where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();
		
	}



}
