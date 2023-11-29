package com.comrade.service.associations.manytomany.link;

import java.util.List;

import com.comrade.model.associations.manytomany.link.PersonManyToManyLink;

public interface PersonManyToManyLinkService {
    public PersonManyToManyLink save(PersonManyToManyLink personManyToManyLink);

    public List<PersonManyToManyLink> getAll();

    public PersonManyToManyLink getByPersonId(Long personId);
}
