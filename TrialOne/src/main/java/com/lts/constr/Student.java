package com.lts.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	Integer id;
	String name;
	String department;
	Course course;

	@Autowired
	public Student(Course course) {
		//super();
		this.course = course;
	}
	public Integer getId() {
		return id;
	}
	
	@Value("${student.id}")
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getDepartment() {
		return department;
	}
	@Value("${student.department}")
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", course=" + course + "]";
	}
	
	
}
