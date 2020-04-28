package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

	private Integer id;
	
	private String name;
	
	private String url;

	public Value() {
		super();
	}

	public Value(Integer id, String name, String url) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
	}

	@Override
	public String toString() {
		return "Value [id=" + id + ", name=" + name + ", url=" + url + "]";
	}
	
	
	

}
