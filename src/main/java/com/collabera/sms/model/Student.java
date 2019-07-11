package com.collabera.sms.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Student {

	@Id 
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private String schoolYear;
	private String major;
	private String degreePursuing;
	private String gpa;
}
