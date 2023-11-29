package com.comrade.modelElementCollectionEmbeddable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerOneRepository extends JpaRepository<CustomerOne, Integer> {

}
