package com.doto.doto.repositories;

import com.doto.doto.documents.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
}
