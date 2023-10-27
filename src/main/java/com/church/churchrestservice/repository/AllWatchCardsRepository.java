package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.shared.AllWatchCardsResponse;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AllWatchCardsRepository extends ReactiveMongoRepository<AllWatchCardsResponse, String> {
}
