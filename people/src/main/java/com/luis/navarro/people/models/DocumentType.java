package com.luis.navarro.people.models;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "document_type")
public class DocumentType implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    private ObjectId id;

	@Indexed(unique = true)
	private String code;
	
	private String name;
}
