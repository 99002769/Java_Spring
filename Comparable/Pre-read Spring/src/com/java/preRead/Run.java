package com.java.preRead;

import java.util.ArrayList;
import java.util.Collections;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu1 = new student("Divya","Kovilpatti",101);
		student stu2 = new student("Deepa","Chennai",102);
		student stu3 = new student("Harini","Coimbatore",103);
		student stu4 = new student("Rajaram","Bangalore",104);
		student stu5 = new student("Vivek","Chennai",105);
		student stu6 = new student("Karthi","Mysuru",106);
		
		ArrayList<student> studentList = new ArrayList<>();
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		studentList.add(stu4);
		studentList.add(stu5);
		studentList.add(stu6);
		
		for (student stud :studentList) {
			System.out.println(stud);
		}
		
		Collections.sort(studentList);
		System.out.println("Sorted List : ");
		
		for (student stud :studentList) {
			System.out.println(stud);
		}
		
	}

}
