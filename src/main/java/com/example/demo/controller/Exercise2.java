package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise2 {
	@Value("${var}")
	public String name;
	@GetMapping("/GET")
	public String get()
	{
		return "Welcome "+name+"!";
	}
  
}


