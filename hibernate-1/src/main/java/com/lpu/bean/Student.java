package com.lpu.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "student")
public class Student implements Serializable {
	private static final long serialVersionUID = -7209693288444782024L;
	@Id
	private String id;
	@Column(name="firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "email")
	private String email;
	
	

}
