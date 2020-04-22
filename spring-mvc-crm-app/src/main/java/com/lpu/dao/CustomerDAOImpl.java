package com.lpu.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lpu.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	Scanner scanner = new Scanner(System.in);

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		
				Session currentSession = sessionFactory.openSession();
						
				Query<Customer> theQuery = 
						currentSession.createQuery("from Customer order by lastName",
													Customer.class);
	
				List<Customer> customers = theQuery.getResultList();
					
				return customers;
	}

	@Override
	public Customer getCustomerById(int id) {
		Session currentSession = sessionFactory.openSession();
		Customer customer = currentSession.get(Customer.class, id);
		return customer;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		Session currentSession = sessionFactory.openSession();
		currentSession.save(customer);
		return customer;
	}


	@Override
	public void deleteCustomer(int id) {
		Session currentSession = sessionFactory.openSession();
		currentSession.getTransaction().begin();
		Query theQuery = currentSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", id);
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
		
	}

	
}
