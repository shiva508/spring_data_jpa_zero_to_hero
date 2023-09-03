package com.comrade.service.associations.onetomany.bidirectional;

import java.util.List;

import com.comrade.model.associations.onetomany.bidirectional.Schedule;

public interface ScheduleService {
	public Schedule saveSchedule(Schedule schedule);

	public Schedule updateSchedule(Schedule schedule);

	public Schedule findScheduleByScheduleId(Long scheduleId);

	public List<Schedule> getAllSchedules();

	public void deleteScheduleById(Long scheduleId);
}
