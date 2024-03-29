package com.comrade.repository.associations.manytomany.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comrade.model.associations.manytomany.bidirectional.AddressManyToManyBi;

@Repository
public interface AddressManyToManyBiRepository extends JpaRepository<AddressManyToManyBi, Long> {

}
