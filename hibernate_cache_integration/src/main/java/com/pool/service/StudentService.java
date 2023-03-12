package com.shiva.service;

import java.util.List;

import com.shiva.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> allStudents();
}
