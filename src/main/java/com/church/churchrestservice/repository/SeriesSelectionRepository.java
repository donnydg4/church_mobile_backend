package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.app.SeriesSelection;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SeriesSelectionRepository extends ReactiveMongoRepository<SeriesSelection, String> {
}
