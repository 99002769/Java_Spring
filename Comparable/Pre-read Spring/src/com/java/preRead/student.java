package com.java.preRead;

public class student implements Comparable<student>{
	private String name;
	private String city;
	private Integer empId;
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String name, String city, Integer empId) {
		super();
		this.name = name;
		this.city = city;
		this.empId = empId;
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
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	@Override
	public String toString() {
		return "student [name=" + name + ", city=" + city + ", empId=" + empId + "]";
	}
	@Override
	public int compareTo(student stu) {
		// TODO Auto-generated method stub
		return this.getCity().compareTo(stu.getCity());
	}
}


