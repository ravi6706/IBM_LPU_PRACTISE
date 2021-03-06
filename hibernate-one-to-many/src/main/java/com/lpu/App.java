package com.lpu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.lpu.entity.MarksDetails;
import com.lpu.entity.Student;

public class App 
{
	static Session sessionObj;
    static SessionFactory sessionFactoryObj;
 
    private static SessionFactory buildSessionFactory() {
        
        Configuration configObj = new Configuration();
        configObj.configure("hibernate.cfg.xml");
 
        
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 
 
        
        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
        return sessionFactoryObj;
    }
    public static void main( String[] args )
    {
    	System.out.println(".......Hibernate One To Many Mapping Example.......\n");
        try {
            sessionObj = buildSessionFactory().openSession();
            sessionObj.beginTransaction();
 
            Student studentObj = new Student("Ravi", "Kumar",  "ravi@gmail.com", "0123456789");
            sessionObj.save(studentObj);
 
            MarksDetails marksObj1 = new MarksDetails("English", "100", "90",  "Pass");  
            marksObj1.setStudent(studentObj);  
            sessionObj.save(marksObj1);
 
            MarksDetails marksObj2 = new MarksDetails("Maths", "100", "99",  "Pass");  
            marksObj2.setStudent(studentObj);
            sessionObj.save(marksObj2);
 
            MarksDetails marksObj3 = new MarksDetails("Science", "100", "94",  "Pass");  
            marksObj3.setStudent(studentObj);
            sessionObj.save(marksObj3);
 
            // Committing The Transactions To The Database
            sessionObj.getTransaction().commit();
 
            System.out.println("\n.......Records Saved Successfully To The Database.......");
        } catch(Exception sqlException) {
            if(null != sessionObj.getTransaction()) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if(sessionObj != null) {
                sessionObj.close();
            }
        }
    }
}
