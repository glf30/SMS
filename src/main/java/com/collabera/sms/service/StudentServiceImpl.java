package com.collabera.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.sms.model.Student;
import com.collabera.sms.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService  {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public void saveOrUpdateStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(String id) {
		studentRepository.deleteById(id);
	}

	@Override
	public Optional<Student> getById(String id) {
		return studentRepository.findById(id);
	}

}
