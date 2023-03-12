package com.shiva.dao;

import java.util.List;

import com.shiva.model.Student;

public interface StudentRepository {
public Student saveStudent(Student student);
public List<Student> allStudents();
}
