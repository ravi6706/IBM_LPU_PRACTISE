package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "employee")
@ApiModel(description="All details about the Employee. ")
public class Employee {
	
	@ApiModelProperty(notes = "The database generated employee ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ApiModelProperty(notes = "The employee name")
	@Column(name = "name", nullable=false)
	private String name;
	@ApiModelProperty(notes = "The employee email")
	@Column(name = "email", nullable=false)
	private String email;
	public Employee() {
		super();
	}
	public Employee(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
