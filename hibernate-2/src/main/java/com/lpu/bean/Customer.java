package com.lpu.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name="customer")
public class Customer implements Serializable{

	private static final long serialVersionUID = 6384770400933685694L;
	
	@Id
	private String customerId;
	@Column(name="name")
	private String customerName;
	@Column(name="email")
	private String customerEmail;
	@Column(name="active")
	private boolean isActive;

	

	

}
