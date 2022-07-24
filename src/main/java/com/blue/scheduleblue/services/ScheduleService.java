package com.blue.scheduleblue.services;

import java.util.List;
import java.util.Optional;

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

	public PersonSchema updated(PersonSchema person) {
		PersonSchema updatedPerson = findById(person.getId());
		updateData(updatedPerson, person);
		return repo.save(updatedPerson);
	}

	private void updateData(PersonSchema updatedPerson, PersonSchema person) {
		updatedPerson.setName(person.getName());
		updatedPerson.setAddress(person.getAddress());
		updatedPerson.setphoneNumber(person.getphoneNumber());;
	}

	public List<PersonSchema> findAll() {
		return repo.findAll();
	}

	public PersonSchema findById(String id) {
		Optional<PersonSchema> person = repo.findById(id);
		return person.orElseThrow(() -> new Error("object not found"));
	}

	public void delete(String id) {
		this.findById(id);
		repo.deleteById(id);
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