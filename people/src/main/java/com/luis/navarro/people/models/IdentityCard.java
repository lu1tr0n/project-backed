package com.luis.navarro.people.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "identity_card")
public class IdentityCard {

	@Id
	private String id;
	
	private String number;
	
	private String expiryDate;
	
	private Date emissionDate;
	
	@DBRef
	private DocumentType documentType;
}
