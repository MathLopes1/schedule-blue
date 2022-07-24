package com.blue.scheduleblue.controllers;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.blue.scheduleblue.dto.PersonDTO;
import com.blue.scheduleblue.schema.PersonSchema;
import com.blue.scheduleblue.services.ScheduleService;

@RestController
@RequestMapping(value="/api/v1")
public class ScheduleController {
	
	@Autowired
	private ScheduleService service;
	
    @PostMapping("/schedule")
	public ResponseEntity<PersonDTO> created(@RequestBody PersonDTO personDTO) {
		PersonSchema schedule = service.fromDTO(personDTO);
        schedule = service.created(schedule);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(schedule.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

    @GetMapping("/schedule")
	public ResponseEntity<List<PersonDTO>> findAll() {
		
		List<PersonSchema> list = service.findAll();
		List<PersonDTO> listDto = list.stream()
            .map(x -> new PersonDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
}
