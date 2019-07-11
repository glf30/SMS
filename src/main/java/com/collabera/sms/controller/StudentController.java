package com.collabera.sms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.sms.model.Student;
import com.collabera.sms.service.StudentService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		List<Student> result = studentService.findAll();
		return new ResponseEntity(result, HttpStatus.OK);
	}
	
	@GetMapping(value="/student/{id}")
	public ResponseEntity<?> getById(@RequestParam("id") String id) {
		Optional<Student> result = studentService.getById(id);
		return new ResponseEntity(result, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> addorUpdateExpense(@RequestBody Student student) {
		studentService.saveOrUpdateStudent(student);
		return new ResponseEntity("Student added succcessfully", HttpStatus.OK);
	}
	
	@DeleteMapping
	public void deleteExpense(@RequestParam("id") String id) {
		studentService.deleteStudent(id);
	}
	
}
