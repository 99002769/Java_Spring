package com.java.model;

public class student {
	private String name;
	private String city;
	private Double marks;
	
	
	
	public student(String name, String city, Double marks) {
		super();
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	
}
