package com.luis.navarro.security.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public String firstPage() {
		return "Begin Site.";
	}
}
