package com.example.demo.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ToDo {
	
	private String todoId;
	private String todoName;
	
	public ToDo(String todoName) {
		
		this.todoId = UUID.randomUUID().toString();
		this.todoName = todoName;
		
	}

}
