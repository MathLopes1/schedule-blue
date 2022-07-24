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

import com.blue.scheduleblue.dto.ScheduleDTO;
import com.blue.scheduleblue.schema.ScheduleSchema;
import com.blue.scheduleblue.services.ScheduleService;

@RestController
@RequestMapping(value="/api/v1")
public class ScheduleController {
	
	@Autowired
	private ScheduleService service;
	
    @PostMapping("/schedule")
	public ResponseEntity<ScheduleDTO> created(@RequestBody ScheduleDTO scheduleDTO) {
		ScheduleSchema schedule = service.fromDTO(scheduleDTO);
        schedule = service.created(schedule);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(schedule.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

    @GetMapping("/schedule")
	public ResponseEntity<List<ScheduleDTO>> findAll() {
		
		List<ScheduleSchema> list = service.findAll();
		List<ScheduleDTO> listDto = list.stream()
            .map(x -> new ScheduleDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
}
