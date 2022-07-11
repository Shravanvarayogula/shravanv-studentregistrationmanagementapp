package com.grealtlearning.studentregistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grealtlearning.studentregistration.model.Student;
import com.greatlearning.studentregistration.repository.StudentRepository;

@Service("StudentServiceImplementation")
public class StudentServiceImplementation implements StudentService {

	@Autowired
	public StudentRepository studentrepo;

	public List<Student> fetchAll() {
		List<Student> students = studentrepo.findAll();
		return students;
	}

	@Override
	public Student SearchById(int id) {
		Optional<Student> student;
		student = studentrepo.findById(id);
		return student.get();
	}

	@Override
	public boolean deleteStudent(int id) {
		studentrepo.deleteById(id);
		return true;
	}

	@Override
	public void save(Student student) {
		studentrepo.save(student);
	}

	@Override
	public Student populateStudentInfo(Student student) {
		Student s = new Student();
		s.setId(student.getId());
		s.setFirst_name(student.getFirst_name());
		s.setLast_name(student.getLast_name());
		s.setCountry(student.getCountry());
		s.setCourse(student.getCourse());
		return s;

	}

	@Override
	public Student populateStudentEntity(Student student) {
		Student s = new Student();
		s.setFirst_name(student.getFirst_name());
		s.setLast_name(student.getLast_name());
		s.setCourse(student.getCourse());
		s.setCountry(student.getCountry());
		return s;

	}
}
