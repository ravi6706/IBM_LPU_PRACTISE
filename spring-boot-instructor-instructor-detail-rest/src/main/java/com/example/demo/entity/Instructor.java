package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="instructor")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "instructor_detail_id")
	private InstructorDetail instructorDetail;
	
	public Instructor() {
		super();
	}
	
	

	public Instructor(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}



	public Instructor(String name, String email, InstructorDetail instructorDetail) {
		super();
		this.name = name;
		this.email = email;
		this.instructorDetail = instructorDetail;
	}

	public Instructor(int id, String name, String email, InstructorDetail instructorDetail) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.instructorDetail = instructorDetail;
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

	 @JsonBackReference
	public InstructorDetail getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(InstructorDetail instructorDetail) {
		this.instructorDetail = instructorDetail;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", email=" + email + ", instructorDetail=" + instructorDetail
				+ "]";
	}

	
	
	
	
	

}
