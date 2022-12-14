package com.luis.navarro.people.configs;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.luis.navarro.people.dtos.Response;
import com.luis.navarro.people.exceptions.NoFoundDataException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Response> handlerException(Exception e) {
		log.error("Exception type: {}", e.getClass());
		return new ResponseEntity<Response> (new Response("Error Generico en el proceso ejecutado.", e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(NoFoundDataException.class)
	public ResponseEntity<Response> notFoundException(NoFoundDataException ex) {
	    return new ResponseEntity<Response> (new Response("Se ha producido un error.", ex.getMessages()), HttpStatus.NOT_FOUND);
	}
}
