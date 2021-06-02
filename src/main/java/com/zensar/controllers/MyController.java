package com.zensar.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "<h2> Hello From Application !!! </h2>";
	}

}
