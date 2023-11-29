package com.pool.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.pool.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	@Autowired
	private SessionFactory sessionFactory;

	public Student saveStudent(Student student) {
		Session session=sessionFactory.getCurrentSession();
		return (Student) session.merge(student);
	}

	public List<Student> allStudents() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("From Student",Student.class);
		return query.getResultList();
	}

}
