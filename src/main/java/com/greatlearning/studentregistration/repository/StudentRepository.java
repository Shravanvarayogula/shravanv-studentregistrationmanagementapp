package com.greatlearning.studentregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grealtlearning.studentregistration.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public Student findByFirstName(String firstname);
	
	public Student findByLastName(String lastname); 
	
	public String findByCourseName(String course_name);

}
