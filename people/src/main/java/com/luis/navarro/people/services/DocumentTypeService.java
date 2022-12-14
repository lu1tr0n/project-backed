package com.luis.navarro.people.services;

import java.util.List;
import java.util.Optional;

import com.luis.navarro.people.models.DocumentType;

public interface DocumentTypeService {
	
	public List<DocumentType> findByAll();
	
	public Optional<DocumentType> findByCode(String code);

	public DocumentType saveDocument(DocumentType document);
	
	public Long counterDocument();
}
