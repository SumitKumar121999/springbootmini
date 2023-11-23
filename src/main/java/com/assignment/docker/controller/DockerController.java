package com.assignment.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class DockerController {
	
	@GetMapping("user")
	public String testMethod()
	{
		return "This is a Sample Ouput Screen ,it says website is working fine !";
	}

}

