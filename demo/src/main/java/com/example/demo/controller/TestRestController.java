package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	
	@RequestMapping(value ="/testValue",method=RequestMethod.GET)
	public String ajax()
	{
		return "Rest Controller Test";
	}
}
