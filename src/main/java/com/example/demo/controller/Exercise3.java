package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise3 
{
	@Value("${color}")
	public String color;
@GetMapping("/get")
public String getMyFav()
{
	return "My Favourite Color is "+ color;
}
}
