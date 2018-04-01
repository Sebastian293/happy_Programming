package edu.morgath.aufgabe2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.morgath.aufgabe2.services.HealthCheckService;

@Controller
@RequestMapping("/rest")
public class HealthCheckController {
	
	@Autowired
	HealthCheckService service;
	
	@RequestMapping("/healthCheck")
	public @ResponseBody String checkHealth() {
		return service.checkHealth();
	}

}
