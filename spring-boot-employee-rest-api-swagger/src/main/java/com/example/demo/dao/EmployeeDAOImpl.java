package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository(value = "")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public void createEmployee(Employee employee) {
		entityManager.persist(employee);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

}
