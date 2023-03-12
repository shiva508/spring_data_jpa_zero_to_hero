package com.pool.model.EXTRALAZYCOLLECTIONS;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ExtraLazyPostRepository extends JpaRepository<Post, Long>{

}
