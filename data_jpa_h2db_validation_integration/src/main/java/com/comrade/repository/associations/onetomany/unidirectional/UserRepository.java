package com.comrade.repository.associations.onetomany.unidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.comrade.model.associations.onetomany.unidirectional.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
