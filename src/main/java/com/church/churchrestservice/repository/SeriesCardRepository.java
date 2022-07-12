package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.SeriesCardResponse;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SeriesCardRepository extends ReactiveMongoRepository<SeriesCardResponse, String> {
}
