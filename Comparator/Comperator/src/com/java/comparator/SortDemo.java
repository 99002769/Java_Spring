package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortDemo{

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
		
		Collections.sort(studentList,new NameSort());
		System.out.println("sorted by name:");
		for (student stud :studentList) {
			System.out.println(stud);
		}
		
		Collections.sort(studentList,new Comparator<student>() {
			public int compare(student stu1,student stu2) {
				return stu1.getCity().compareTo(stu2.getCity());
			}
		});
		
		System.out.println("sorted by city:");
		for (student stud :studentList) {
			System.out.println(stud);
		}
			
		}
		
	}


