package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssa/web")
public class Controller {
     @GetMapping("/find/ssn")
	 public ResponseEntity<?>getSSNById(@PathVariable Integer ssn)
	 {
		if(String.valueOf(ssn).length()!=9)
			return new ResponseEntity<String>("invalid ssn",HttpStatus.BAD_REQUEST);
		return null;
		}
	 
}
