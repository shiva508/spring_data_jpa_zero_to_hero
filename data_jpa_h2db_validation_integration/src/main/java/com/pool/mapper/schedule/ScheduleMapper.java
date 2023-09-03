package com.comrade.mapper.schedule;

import org.springframework.stereotype.Component;

import com.comrade.model.associations.onetomany.bidirectional.Schedule;

@Component
public class ScheduleMapper {

	public void scheduleObjectMapper(Schedule schedule) {
		
		schedule.getTasks().forEach(task->{
			task.setSchedule(schedule);
		});
	}
}
