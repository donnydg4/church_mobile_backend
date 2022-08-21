package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.DisplayCardResponse;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DisplayCardRepository extends ReactiveMongoRepository<DisplayCardResponse, String> {

}
