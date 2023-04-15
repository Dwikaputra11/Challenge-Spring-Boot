package com.binar.challenge_4.service;

import com.binar.challenge_4.models.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ScheduleService {
    Page<Schedule> findAll(Pageable pageable);

    Schedule findById(int id);

    Schedule save(Schedule schedule);

    Schedule update(Schedule updatedSchedule);

    void delete(int id);
}
