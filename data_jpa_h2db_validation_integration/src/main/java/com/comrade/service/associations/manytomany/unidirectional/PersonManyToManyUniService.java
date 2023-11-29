package com.comrade.service.associations.manytomany.unidirectional;

import java.util.List;

import com.comrade.model.associations.manytomany.unidirectional.PersonManyToManyUni;

public interface PersonManyToManyUniService {
    public PersonManyToManyUni save(PersonManyToManyUni personManyToManyUni);

    public List<PersonManyToManyUni> getAll();

    public PersonManyToManyUni getByPersonId(Long personId);
}
