package com.gl.Clgfstmgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "First_name")
	private String firstName;
	@Column(name = "Last_name")
	private String lastName;
	@Column(name = "Course")
	private String Course;
	@Column(name = "Country")
	private String Country;

	public Student(String firstName, String lastName, String course, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Course = course;
		Country = country;
	}

}
