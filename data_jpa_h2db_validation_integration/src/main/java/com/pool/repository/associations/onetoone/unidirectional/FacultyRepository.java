package com.comrade.repository.associations.onetoone.unidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import com.comrade.model.associations.onetoone.unidirectional.Faculty;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> ,JpaSpecificationExecutor<Faculty>{

}
