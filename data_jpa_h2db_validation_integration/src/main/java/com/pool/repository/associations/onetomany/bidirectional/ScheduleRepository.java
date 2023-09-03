package com.comrade.repository.associations.onetomany.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.comrade.model.associations.onetomany.bidirectional.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long>{

}
