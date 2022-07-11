package com.grealtlearning.studentregistration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_table")
	public class Student {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public int id;

		@Column(name = "first_name")
		public String firstName;

		@Column(name = "last_name")
		public String lastname;

		@Column(name = "course")
		public String course;

		@Column(name = "country")
		public String country;

		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */

		public String getFirst_name() {
			return firstName;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		public void setFirst_name(String first_name) {
			this.firstName = first_name;
		}

		public String getLast_name() {
			return lastname;
		}

		public void setLast_name(String last_name) {
			this.lastname = last_name;
		}

		public String getCourse() {
			return this.course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}
	}
