package com.comrade.service.associations.onetoone.unidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comrade.model.associations.onetoone.unidirectional.Subject;
import com.comrade.repository.associations.onetoone.unidirectional.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;

	@Transactional
	@Override
	public Subject saveSubject(Subject subject) {
		return subjectRepository.save(subject);
	}

	@Transactional
	@Override
	public List<Subject> getAllSubjects() {
		return subjectRepository.findAll();
	}
}
