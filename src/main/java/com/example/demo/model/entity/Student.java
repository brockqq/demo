package com.example.demo.model.entity;

public class Student {
	private String lastName;
	private String firstName;
	public Student(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	} 
}
 