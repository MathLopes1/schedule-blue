
package com.blue.scheduleblue.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blue.scheduleblue.schema.PersonSchema;

public interface ScheduleRepository extends MongoRepository<PersonSchema, String> { }