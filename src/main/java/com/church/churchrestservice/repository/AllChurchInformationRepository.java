package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.app.AllChurchInformation;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AllChurchInformationRepository extends ReactiveMongoRepository<AllChurchInformation, String> {
}
