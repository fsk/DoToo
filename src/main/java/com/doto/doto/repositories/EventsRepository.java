package com.doto.doto.repositories;

import com.doto.doto.documents.Events;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventsRepository extends MongoRepository<Events, String> {
}
