package com.example.demo.studentSorting;

import java.util.Comparator;

import com.example.demo.student.student;

public class sortstudentbyname implements Comparator<student> {

	@Override
	public int compare(student o1, student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
