package io.spring.pivotal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${greeting}")
	private String greeting;
	
	@Autowired
	private GreetingService greetingService;
	
	@RequestMapping("/")
	public String hello() {
		//return String.format("%s World!", greeting);
		return String.format("%s World!", greetingService.getGreeting());
	}
}
