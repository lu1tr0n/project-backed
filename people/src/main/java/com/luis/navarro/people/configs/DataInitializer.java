package com.luis.navarro.people.configs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luis.navarro.people.models.DocumentType;
import com.luis.navarro.people.services.DocumentTypeService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {
	
	@Autowired
	private DocumentTypeService documentTypeService;

	@Override
	public void run(String... args) throws Exception {
		if (documentTypeService.counterDocument() > 0) {
            log.info("Data already exists. Skipping data population");
            return;
        }
		
		documentTypeService.saveDocument(new DocumentType(null, "DUI", "Documento Unico de Identidad"));
		documentTypeService.saveDocument(new DocumentType(null, "NIT", "Numero de Identificacion Tributaria"));
		documentTypeService.saveDocument(new DocumentType(null, "CI", "Cédula de Identidad"));
	}

}
