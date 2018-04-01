package edu.morgath.aufgabe2.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HealthCheckServiceTest {

	HealthCheckService healthService = new HealthCheckService();
	
	@Test
	public void HealthCheckTest() throws Exception {
		assertEquals(HealthCheckService.HEALTH_OK, healthService.checkHealth());
	}
}
