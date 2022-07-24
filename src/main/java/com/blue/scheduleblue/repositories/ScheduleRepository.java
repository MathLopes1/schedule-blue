
package com.blue.scheduleblue.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blue.scheduleblue.schema.ScheduleSchema;

public interface ScheduleRepository extends MongoRepository<ScheduleSchema, String> { }