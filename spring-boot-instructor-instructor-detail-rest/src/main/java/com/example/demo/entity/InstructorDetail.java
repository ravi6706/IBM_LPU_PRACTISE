package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="youtube_channel")
	private String youtubeChannel;
	
	@Column(name="hobby")
	private String hobby;

	
	
	@OneToOne(cascade= CascadeType.ALL, mappedBy = "instructorDetail")
    private Instructor instructor;

	public InstructorDetail() {
		super();
	}

	public InstructorDetail(int id, String youtubeChannel, String hobby, Instructor instructor) {
		super();
		this.id = id;
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
		this.instructor = instructor;
	}

	public InstructorDetail(String youtubeChannel, String hobby, Instructor instructor) {
		super();
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
		this.instructor = instructor;
	}
	

	public InstructorDetail(String youtubeChannel, String hobby) {
		super();
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	
	@JsonManagedReference
	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby
				+ ", instructor=" + instructor + "]";
	}
	
	

}
