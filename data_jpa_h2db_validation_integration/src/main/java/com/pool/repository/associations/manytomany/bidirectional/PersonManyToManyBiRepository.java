package com.comrade.repository.associations.manytomany.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comrade.model.associations.manytomany.bidirectional.PersonManyToManyBi;

@Repository
public interface PersonManyToManyBiRepository extends JpaRepository<PersonManyToManyBi, Long> {

}
