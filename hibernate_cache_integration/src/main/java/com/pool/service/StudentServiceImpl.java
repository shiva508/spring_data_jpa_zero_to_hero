package com.shiva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.dao.StudentRepository;
import com.pool.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	@Transactional
	public Student saveStudent(Student student) {
		return studentRepository.saveStudent(student);
	}
	@Transactional
	public List<Student> allStudents() {
		return studentRepository.allStudents();
	}

}
