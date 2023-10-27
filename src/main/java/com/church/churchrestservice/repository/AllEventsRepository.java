package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.website.MainEventsModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AllEventsRepository extends ReactiveMongoRepository<MainEventsModel, String> {
}
