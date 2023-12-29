package com.ecsfin.oauth2.kecloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/v1")
	@PreAuthorize("hasRole('DemoApp-User')")
	public String demo() {
		return "Secured Access for user using Keycloak";
	}
	
	@GetMapping("/v2")
	@PreAuthorize("hasRole('DemoApp-Admin')")
	public String demoAdmin() {
		return "Secured Access for admin using Keycloak";
	}
}
