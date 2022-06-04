package com.hk.obf.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObfController {
	
	@GetMapping("helloworld")
	public String getHelloWorld() {
		return "Hello World";
	}

}
