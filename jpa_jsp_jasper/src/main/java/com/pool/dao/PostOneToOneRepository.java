package com.pool.dao;

import com.pool.model.onetoone.PostOneToOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PostOneToOneRepository extends JpaRepository<PostOneToOne, Integer> {

}
