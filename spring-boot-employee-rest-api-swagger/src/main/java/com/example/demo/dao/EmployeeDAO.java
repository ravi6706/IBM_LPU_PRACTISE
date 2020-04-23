package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDAO {
	
	public void createEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public Employee findById(int id);
	
	public void deleteEmployee(int id);
	

}
