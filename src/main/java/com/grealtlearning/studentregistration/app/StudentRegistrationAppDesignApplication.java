package com.grealtlearning.studentregistration.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StudentRegistrationAppDesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegistrationAppDesignApplication.class, args);
		System.out.println("=========================");
		System.out.println("Database Schema Created for this Application");
		System.out.println("=========================");

	}

}
