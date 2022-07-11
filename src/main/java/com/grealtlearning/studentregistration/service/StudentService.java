package com.grealtlearning.studentregistration.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grealtlearning.studentregistration.model.Student;


@Service
public interface StudentService {
	public List<Student> fetchAll();

	public Student SearchById(int id);

	public void save(Student student);
	
	public boolean deleteStudent(int id);

	public Student populateStudentInfo(Student s);

	public Student populateStudentEntity(Student student);

}
