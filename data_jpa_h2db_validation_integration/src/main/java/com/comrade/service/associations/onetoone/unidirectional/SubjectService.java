package com.comrade.service.associations.onetoone.unidirectional;

import java.util.List;

import com.comrade.model.associations.onetoone.unidirectional.Subject;

public interface SubjectService {
	public Subject saveSubject(Subject subject);

	public List<Subject> getAllSubjects();
}
