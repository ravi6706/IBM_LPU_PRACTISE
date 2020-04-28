package com.example.demo.model;

public class Account {

	private Integer id;
	private String customerId;
	private String number;	

	public Account() {
		
	}

	public Account(String customerId, String number) {
		super();
		this.customerId = customerId;
		this.number = number;
	}

	public Account(Integer id, String customerId, String number) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.number = number;
	}

	public Account(Integer id, String number) {
		super();
		this.id = id;
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	

}