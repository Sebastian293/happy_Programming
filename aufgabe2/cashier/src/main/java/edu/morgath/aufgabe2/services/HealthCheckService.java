package edu.morgath.aufgabe2.services;

import org.springframework.stereotype.Component;

@Component
public class HealthCheckService {
	static final String HEALTH_OK = "OK";
	
	public String checkHealth() {
		return HEALTH_OK;
	}

}
