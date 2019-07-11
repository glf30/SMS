package com.collabera.sms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.collabera.sms.model.Student;

public interface StudentRepository extends MongoRepository<Student, String>{
	
}