package com.comrade.service.associations.onetoone.unidirectional;

import java.util.List;

import com.comrade.model.associations.onetoone.unidirectional.Faculty;

public interface FacultyService {
	
	public Faculty saveFaculty(Faculty faculty);

	public List<Faculty> getAllFaculty();
}
