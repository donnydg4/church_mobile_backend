package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.BasePageCardResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BasePageCardRepository extends MongoRepository<BasePageCardResponse, String> {

}
