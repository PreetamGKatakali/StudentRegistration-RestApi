package com.example.demo.studentService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.student.student;
import com.example.demo.studentRepository.studentRepository;
import com.example.demo.studentSorting.sortstudentbyname;

@Service
public class studentService {
	@Autowired
	studentRepository s;
	
	List<student> sortlist;
	
	
	public student addstudent(student std) {
		s.save(std);
		return std;
	}
	
	public Optional<student> getdetails(int stdid) {
		return s.findById(stdid);
		
	}
	
	public String deletestudentbyid(int stdid) {
		s.deleteById(stdid);
		return "Done deleted";
	}
	
	public student updatestudentbyid(student std,int stdid) {
		student oldstd=s.findById(stdid).orElse(null);
		oldstd.setStdid(std.getStdid());
		oldstd.setName(std.getName());
		oldstd.setGrade(std.getGrade());
		s.save(oldstd);
		return oldstd;
		
	}
	
	public List<student> getlist(){
		return s.findAll();
	}
	
	public List<student> sortbyname(){
		 sortlist=s.findAll();
		 Collections.sort(sortlist,new sortstudentbyname());
		 return sortlist;
		
	}
	
	
	
}
