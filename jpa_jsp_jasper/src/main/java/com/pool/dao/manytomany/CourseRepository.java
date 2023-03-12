package com.pool.dao.manytomany;

import com.pool.model.manytomany.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
