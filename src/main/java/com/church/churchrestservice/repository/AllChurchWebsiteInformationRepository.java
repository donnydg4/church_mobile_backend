package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.website.AllWebsiteInformationModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AllChurchWebsiteInformationRepository extends ReactiveMongoRepository<AllWebsiteInformationModel, String> {
}
