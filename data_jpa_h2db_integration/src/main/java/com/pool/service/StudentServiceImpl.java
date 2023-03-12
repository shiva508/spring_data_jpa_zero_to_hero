package com.pool.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentCustumRepository;
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentCustumRepository studentCustumRepository;
	@Override
	public void saveStudent(Student student) {
		
	}

	@Override
	public List<Student> getAllStudents() {
		return studentCustumRepository.getAllStudents();
	}

	@Override
	public List<String> getAllName() {
		return studentCustumRepository.getAllName();
	}

	@Override
	public List<Student> getAllStudentsByID(int id) {
		return studentCustumRepository.getAllStudentsByID(id);
	}

	@Override
	public Long getMaxID() {
		return studentCustumRepository.getMaxID();
	}

	@Override
	public void Update(int id) {
		studentCustumRepository.Update(id);
	}

	@Override
	public void remove(int id) {
		studentCustumRepository.remove(id);
	}
	

}
