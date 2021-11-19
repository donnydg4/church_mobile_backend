package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.SeriesCardResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeriesCardRepository extends MongoRepository<SeriesCardResponse, String> {
}
