package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	
	public void createEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();


}
