package com.lts.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Employee {
	
	String empName;
	Integer empId;
	String department;
	@Autowired
	Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	@Value("${employee.empName}")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	public Integer getEmpId() {
		return empId;
	}
	
	@Value("${employee.empId}")
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getDepartment() {
		return department;
	}
	
	@Value("${employee.department}")
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", department=" + department + ", address="
				+ address + "]";
	}
	

}
