package com.comrade.repository.associations.manytomany.unidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comrade.model.associations.manytomany.unidirectional.AddressManyToManyUni;

@Repository
public interface AddressManyToManyUniRepository extends JpaRepository<AddressManyToManyUni, Long> {

}
