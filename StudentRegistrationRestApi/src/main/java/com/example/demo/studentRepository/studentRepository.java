package com.example.demo.studentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.student.student;

public interface studentRepository extends JpaRepository<student,Integer>{

}
