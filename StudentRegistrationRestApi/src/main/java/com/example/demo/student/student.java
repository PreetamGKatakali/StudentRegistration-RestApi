package com.example.demo.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	@Id
	int stdid;
	String name;
	double grade;
	public student(int stdid, String name, double grade) {
		this.stdid = stdid;
		this.name = name;
		this.grade = grade;
	}
	
	public student() {
		super();
	}

	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "student [stdid=" + stdid + ", name=" + name + ", grade=" + grade + "]";
	}
	

}
