package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.calendar.CalendarModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CalendarEventsRepository extends ReactiveMongoRepository<CalendarModel, String> {
}
