package com.doto.doto.repositories;

import com.doto.doto.documents.Notes;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotesRepository extends MongoRepository<Notes, String> {
}
