package com.luis.navarro.people.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.navarro.people.models.DocumentType;
import com.luis.navarro.people.repositories.DocumentTypeRepository;
import com.luis.navarro.people.services.DocumentTypeService;

@Service
public class DocumentTypeServiceImpl implements DocumentTypeService {
	
	@Autowired
	private DocumentTypeRepository repo;
	
	@Override
	public List<DocumentType> findByAll() {
		return repo.findAll();
	}

	@Override
	public Optional<DocumentType> findByCode(String code) {
		return repo.findByCode(code);
	}

	@Override
	public DocumentType saveDocument(DocumentType document) {
		return repo.insert(document);
	}

	@Override
	public Long counterDocument() {
		return repo.count();
	}
}
