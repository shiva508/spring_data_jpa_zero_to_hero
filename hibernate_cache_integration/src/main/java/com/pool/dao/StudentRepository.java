package com.pool.dao;

import java.util.List;

import com.pool.model.Student;

public interface StudentRepository {
public Student saveStudent(Student student);
public List<Student> allStudents();
}
