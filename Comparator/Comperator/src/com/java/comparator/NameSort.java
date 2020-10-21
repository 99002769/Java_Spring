package com.java.comparator;

import java.util.Comparator;

public class NameSort implements Comparator<student>{

	@Override
	public int compare(student stu1, student stu2) {
		// TODO Auto-generated method stub
		return stu1.getName().compareTo(stu2.getName());
	}
	

}
