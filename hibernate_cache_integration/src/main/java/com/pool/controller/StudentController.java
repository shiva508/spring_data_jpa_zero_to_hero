package com.shiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.model.Student;
import com.shiva.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping(value="/save",produces = { MediaType.APPLICATION_JSON_VALUE})
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	@GetMapping(value="/all",produces = { MediaType.APPLICATION_JSON_VALUE})
	public List<Student> allStudents(){
		return studentService.allStudents();
	}
}
