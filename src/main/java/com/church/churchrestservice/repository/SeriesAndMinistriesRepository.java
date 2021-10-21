package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.SeriesAndMinistries;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeriesAndMinistriesRepository extends MongoRepository<SeriesAndMinistries, String> {

}
