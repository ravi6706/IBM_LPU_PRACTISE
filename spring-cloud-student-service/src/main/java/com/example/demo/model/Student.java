package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rollNo")
	private int rollNo;
	@Column(name = "studentName")
	private String studentName;
	@Column(name = "studentClass")
	private String studentClass;
	@Column(name = "schoolName")
	private String schoolName;
	public Student(String studentName, String studentClass, String schoolName) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.schoolName = schoolName;
	}
	public Student() {
		super();
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", schoolName=" + schoolName + "]";
	}
	
}
