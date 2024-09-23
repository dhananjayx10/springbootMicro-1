package com.micro.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Welcome-ser")
public interface WelcomeFeignClient {

	@GetMapping("/welcome")
	public String getWelcomeMsg();

}
