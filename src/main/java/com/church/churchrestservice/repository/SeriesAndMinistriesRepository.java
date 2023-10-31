package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.app.SeriesAndMinistries;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SeriesAndMinistriesRepository extends ReactiveMongoRepository<SeriesAndMinistries, String> {

}
