package com.example.demo.MyController;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.student;
import com.example.demo.studentRepository.studentRepository;
import com.example.demo.studentService.studentService;

import jakarta.persistence.criteria.CriteriaBuilder.In;


@RestController
public class MyController {
	
	@Autowired
	studentService s;
	
	@GetMapping("/")
	public String gethome() {
		return "welcome to student";
	}
	
	@GetMapping("/list")
	public List<student> getlist(){
		return s.getlist();
	}
	
	@PostMapping("/add")
	public student addstudent(@RequestBody student std){
		return s.addstudent(std);
	}
	
	@GetMapping("/student/{stdid}")
	public Optional<student> getdetails(@PathVariable String stdid) {
		return s.getdetails(Integer.parseInt(stdid));
	}
	
	@GetMapping("/delete/{stdid}")
	public String deletstudentbyid(@PathVariable String stdid) {
		return s.deletestudentbyid(Integer.parseInt(stdid));
	}
	
	@PostMapping("/update/{stdid}")
	public student updatestudentbyid(@RequestBody student  std,@PathVariable String stdid)
	{
		return s.updatestudentbyid(std,Integer.parseInt(stdid));
	}
	
	@GetMapping("/list/sortbyname")
	public List<student> sortstudentbyname(){
		return s.sortbyname();
	}
	
}
