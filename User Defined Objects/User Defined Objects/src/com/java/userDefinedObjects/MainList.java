package com.java.userDefinedObjects;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

import com.java.model.student;

public class MainList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <student> studentList = new ArrayList<>();
		student stu1 = new student("Divya Preethaa","Coimbatore",98.0);
		studentList.add(stu1);
		studentList.add(new student("Deepa","Coimbatore",85.0));
		studentList.add(new student("Gayu","Chennai",35.0));
		studentList.add(new student("Ritu","Bangalore",100.0));
		studentList.add(new student("Deepa","Mysuru",29.0));
		
		System.out.println(studentList);
		Iterator<student> itr = studentList.iterator();
		while(itr.hasNext()) {
			student stu = itr.next();
			System.out.println(stu);
		}
		for(student stu11:studentList) {
			System.out.println(stu11);
		}
		
		System.out.println("**************Reverse Order************");
		
		ListIterator<student> listIter = studentList.listIterator(studentList.size());
		
		
		while (listIter.hasPrevious()){
			student stud = listIter.previous();
			System.out.println(stud);
		}
		
		
		
		
		

	}

}
