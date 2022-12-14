package com.luis.navarro.people.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luis.navarro.people.models.IdentityCard;

@Repository("IdentifyCardRepository")
public interface IdentifyCardRepository extends MongoRepository<IdentityCard, String> {

	Optional<IdentityCard> findByNumber(String number);
}
