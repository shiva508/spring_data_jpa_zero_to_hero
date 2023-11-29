package com.comrade.service.associations.onetoone.bidirectional;

import java.util.List;

import com.comrade.model.associations.onetoone.bidirectional.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public Student getStudentBySudentId(Integer studentId);
	public List<Student> getAllStuudents();
	public void deleteStudentByStudentId(Integer studentId);
}
