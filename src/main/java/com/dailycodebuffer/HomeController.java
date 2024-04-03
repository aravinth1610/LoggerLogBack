package com.dailycodebuffer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    Logger log = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/test/{name}")
	public String greeting(@PathVariable String name) {
	//	log.debug("Request {}", name);
		if (name.equalsIgnoreCase("test")) {
			throw new RuntimeException("Opps Exception raised....");
		}
		String response = "Hi " + name + " Welcome to Java Techie";
		log.debug("Response {}", response);
		return response;
	}

    
    
    
}
