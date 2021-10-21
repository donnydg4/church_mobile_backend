package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.EventsAndActivities;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventsAndActivitiesRepository extends MongoRepository<EventsAndActivities, String> {

}
