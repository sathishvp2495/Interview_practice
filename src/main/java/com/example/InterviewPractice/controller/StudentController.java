package com.example.InterviewPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.InterviewPractice.entiry.Student;
import com.example.InterviewPractice.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/all")
	public List<Student> listAllStudents(){
		return studentService.listStudents();
	}
	
	@PostMapping("/save")
	public Student saveStudnet(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

}
