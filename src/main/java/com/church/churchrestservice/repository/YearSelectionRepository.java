package com.church.churchrestservice.repository;

import com.church.churchrestservice.beans.YearSelection;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface YearSelectionRepository extends ReactiveMongoRepository<YearSelection, String> {
}
