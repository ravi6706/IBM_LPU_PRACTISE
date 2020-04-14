package com.lpu;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lpu.bean.Student;

public class App {
	public static void main(String[] args) {

		try {
			
			SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
			Session session=factory.openSession();
			Student student=new Student();
			student.setId(UUID.randomUUID().toString());
			student.setFirstName("Ravi");
			student.setLastName("Kumar");
			student.setEmail("ravi@demo.com");
			session.getTransaction().begin();
			session.save(student);
			session.getTransaction().commit();
			System.out.println("One Item Saved Successfully..!");

		} catch (Exception e) {

		}
	}
}
