package com.qualitto.department.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

	@GetMapping("/health")
	public String healthChk() {
		return "Department Service OK";
	}
}
