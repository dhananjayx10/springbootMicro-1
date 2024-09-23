package com.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.client.WelcomeFeignClient;

@RestController
public class GreetRestController {
	
	@Autowired //object creation 
	private WelcomeFeignClient welcomeClient;
	
	
	@GetMapping("/greet")
	public String getGreetmsg() {
		
		String welmsg = welcomeClient.getWelcomeMsg();
		String msg = "Good morning ";
		return msg + welmsg ;
	}

}
