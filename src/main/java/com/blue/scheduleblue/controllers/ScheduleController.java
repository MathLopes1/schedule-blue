package com.blue.scheduleblue.controllers;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.blue.scheduleblue.dto.PersonDTO;
import com.blue.scheduleblue.schema.PersonSchema;
import com.blue.scheduleblue.services.ScheduleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api/v1")
public class ScheduleController {
	
	@Autowired
	private ScheduleService service;
	
    @PostMapping("/schedule")
	public ResponseEntity<PersonDTO> created(@Valid @RequestBody PersonDTO personDTO) {
		PersonSchema person = service.fromDTO(personDTO);
        person = service.created(person);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(person.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping("/person/{id}")
 	public ResponseEntity<Void> update(@RequestBody PersonDTO personDTO, @PathVariable(value = "id") String id) {
		PersonSchema person = service.fromDTO(personDTO);
		person.setId(id);
		person = service.updated(person);
		return ResponseEntity.noContent().build();
	}

    @GetMapping("/schedule")
	public ResponseEntity<List<PersonDTO>> findAll() {
		
		List<PersonSchema> list = service.findAll();
		List<PersonDTO> listDto = list.stream()
            .map(x -> new PersonDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}

	@GetMapping("person/{id}")
	public ResponseEntity<PersonDTO> findById(@PathVariable String id) {
		PersonSchema person = service.findById(id);
		return ResponseEntity.ok().body(new PersonDTO(person));
	}

	@DeleteMapping("person/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
