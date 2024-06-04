package com.springsecurity.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String greetings() {
		return "Hello from me ";
	}
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/user")
	public String userEndpoint() {
		return "Hello User ";
	}
	
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public String adminEndPoint() {
		return "Hello, Admin ";
	}
}
