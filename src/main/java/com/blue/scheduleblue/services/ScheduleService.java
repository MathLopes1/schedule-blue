package com.blue.scheduleblue.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blue.scheduleblue.dto.ScheduleDTO;
import com.blue.scheduleblue.repositories.ScheduleRepository;
import com.blue.scheduleblue.schema.ScheduleSchema;

@Service
public class ScheduleService {

	@Autowired
	private ScheduleRepository repo;

	public ScheduleSchema created(ScheduleSchema schedule) {
		return repo.insert(schedule);
	}

	public ScheduleSchema fromDTO(ScheduleDTO scheduleDto) {
		return new ScheduleSchema
            (
             scheduleDto.getId(),
             scheduleDto.getName(),
             scheduleDto.getAddress(),
             scheduleDto.getphoneNumber()
            );
	}
}