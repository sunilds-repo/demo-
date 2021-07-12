package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("welcome")
	public ResponseEntity<?> getWlcom() {
		return new ResponseEntity<>("Welcome to Application", HttpStatus.OK);
	}
}
