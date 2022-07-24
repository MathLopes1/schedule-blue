package com.blue.scheduleblue.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blue.scheduleblue.dto.PersonDTO;
import com.blue.scheduleblue.repositories.ScheduleRepository;
import com.blue.scheduleblue.schema.PersonSchema;

@Service
public class ScheduleService {

	@Autowired
	private ScheduleRepository repo;

	public PersonSchema created(PersonSchema schedule) {
		return repo.insert(schedule);
	}

	public List<PersonSchema> findAll() {
		return repo.findAll();
	}

	public PersonSchema fromDTO(PersonDTO personDTO) {
		return new PersonSchema
            (
             personDTO.getId(),
             personDTO.getName(),
             personDTO.getAddress(),
             personDTO.getphoneNumber()
            );
	}
}