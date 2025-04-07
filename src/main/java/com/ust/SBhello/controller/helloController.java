package com.ust.SBhello.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class helloController {
	
	@GetMapping("/hello")
	public String sayHello(HttpServletRequest request) {
		return "Hello : " + request.getSession().getId();
	}
	
	@GetMapping("/hi")
	public CsrfToken getToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
}