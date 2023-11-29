package com.comrade.dao;

import com.comrade.model.embeddedId.StudentembeddedId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentembeddedIdRepository extends JpaRepository<StudentembeddedId, Integer> {

}
