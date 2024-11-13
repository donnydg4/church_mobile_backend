package com.church.churchrestservice.repository;


import com.church.churchrestservice.beans.app.EventsAndActivities;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EventsAndActivitiesRepository extends ReactiveMongoRepository<EventsAndActivities, String> {

}
