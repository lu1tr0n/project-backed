package com.luis.navarro.people.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NoFoundDataException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String messages;

	private String errors;
	
	private String causes;

	public NoFoundDataException(String messages) {
		this.messages = messages;
	}
}