package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.BasePageCardResponse;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BasePageCardRepository extends ReactiveMongoRepository<BasePageCardResponse, String> {

}
