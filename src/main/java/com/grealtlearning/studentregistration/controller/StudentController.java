package com.grealtlearning.studentregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grealtlearning.studentregistration.model.Student;
import com.grealtlearning.studentregistration.service.StudentServiceImplementation;

@RestController
@RequestMapping("/studentmanagementregistationtapp")
public class StudentController {

	@Autowired
	private StudentServiceImplementation student_service_implement;

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome-students";
	}

	@GetMapping("/printstudents")
	public String printStudents(Model theModel) {
		List<Student> student = student_service_implement.fetchAll();
		theModel.addAttribute(student);
		return "search-list-students";
	}

	@GetMapping("/printallstudents")
	public List<Student> getStudents() {
		return student_service_implement.fetchAll();
	}

	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable int id) {
		return student_service_implement.SearchById(id);

	}

	@PostMapping("/savestudent")
	public String saveStudent(@RequestParam("first_name") String firstname, @RequestParam("last_name") String lastname,
			@RequestParam("course") String course, @RequestParam("country") String country) {
		Student student = new Student();
		student.setFirst_name(firstname);
		student.setLast_name(lastname);
		student.setCountry(country);
		student.setCourse(course);
		student_service_implement.save(student);
		return "redirect:/printstudent";
	}

	@DeleteMapping("/student/{id}")
	public boolean deleteStudent(@PathVariable int id) {
		return student_service_implement.deleteStudent(id);
	}
}
