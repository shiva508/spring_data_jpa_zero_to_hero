package com.comrade.dao;

import com.comrade.model.onetoone.PostOneToOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PostOneToOneRepository extends JpaRepository<PostOneToOne, Integer> {

}
