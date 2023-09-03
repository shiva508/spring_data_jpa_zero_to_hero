package com.comrade.repository.associations.manytomany.link;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comrade.model.associations.manytomany.link.PersonManyToManyLink;

@Repository
public interface PersonManyToManyLinkRepository extends JpaRepository<PersonManyToManyLink, Long> {

}
