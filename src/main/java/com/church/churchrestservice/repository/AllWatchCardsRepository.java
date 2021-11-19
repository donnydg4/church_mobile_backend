package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.AllWatchCardsResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AllWatchCardsRepository extends MongoRepository<AllWatchCardsResponse, String> {
}
