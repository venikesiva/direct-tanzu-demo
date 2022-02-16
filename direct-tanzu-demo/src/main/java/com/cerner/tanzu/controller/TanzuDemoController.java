package com.cerner.tanzu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TanzuDemoController {

	
	@GetMapping("/welcome")
	public ResponseEntity<String> getHello(){
		return ResponseEntity.ok("Welcome to Tanzu Application Service");
	}
}
