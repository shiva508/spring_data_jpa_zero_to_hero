package com.comrade.service.associations.manytomany.bidirectional;

import java.util.List;

import com.comrade.model.associations.manytomany.bidirectional.PersonManyToManyBi;

public interface PersonManyToManyBiService {
    public PersonManyToManyBi save(PersonManyToManyBi personManyToManyUni);

    public List<PersonManyToManyBi> getAll();

    public PersonManyToManyBi getByPersonId(Long personId);
}
