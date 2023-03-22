package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.MainEventsModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AllEventsRepository extends ReactiveMongoRepository<MainEventsModel, String> {
}
