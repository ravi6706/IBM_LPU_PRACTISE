package com.lpu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lpu.entity.ProjectDetail;
import com.lpu.entity.Student;

public class Create {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(ProjectDetail.class).buildSessionFactory();
		
		Session session = factory.openSession();
		try {			
			
			
			Student tempStudent = 
					new Student("Ravi", "Kumar", "ravi@gmail.com");
			
			ProjectDetail tempProjectDetail =
					new ProjectDetail(
							"Java Full Stack Project",
							"yes");		
			
			// associate the objects
			tempStudent.setProjectDetail(tempProjectDetail);
			
			// start a transaction
			session.beginTransaction();
			
			// save the instructor
			//
			// Note: this will ALSO save the details object
			// because of CascadeType.ALL
			//
			System.out.println("Saving instructor: " + tempStudent);
			session.save(tempStudent);					
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
