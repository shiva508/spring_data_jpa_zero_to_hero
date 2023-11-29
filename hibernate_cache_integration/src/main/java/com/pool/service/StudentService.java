package com.pool.service;

import java.util.List;

import com.pool.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> allStudents();
}
