package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.DisplayCardResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DisplayCardRepository extends MongoRepository<DisplayCardResponse, String> {

}
