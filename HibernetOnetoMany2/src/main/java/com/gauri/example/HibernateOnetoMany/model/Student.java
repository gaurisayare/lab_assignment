package com.gauri.example.HibernateOnetoMany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="stud_data")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stud_id")
	private int id;
	
	@Column(name="stud_name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="couse_id")
	private Course course;

	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
