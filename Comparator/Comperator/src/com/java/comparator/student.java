package com.java.comparator;

public class student {
	private String name;
	private String city;
	private Integer marks;
	
	
	
	public student(String name, String city, Integer marks) {
		super();
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
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
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	
	
}
