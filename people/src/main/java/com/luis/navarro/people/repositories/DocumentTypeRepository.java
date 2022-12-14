package com.luis.navarro.people.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luis.navarro.people.models.DocumentType;

@Repository("DocumentTypeRepository")
public interface DocumentTypeRepository extends MongoRepository<DocumentType, String> {

	Optional<DocumentType> findByCode(String code);
}
