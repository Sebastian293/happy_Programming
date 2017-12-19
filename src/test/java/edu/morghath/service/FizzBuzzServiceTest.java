package edu.morghath.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzServiceTest {

	@Test
	public void fizzBuzzSimpleValuesTest() throws Exception {
		String simpleNummber = FizzBuzzService.fizzBuzz(1);
		String numberDivBy3 = FizzBuzzService.fizzBuzz(36);
		String numberDivBy5 = FizzBuzzService.fizzBuzz(80);
		String numberDivBy3and5 = FizzBuzzService.fizzBuzz(45);
		
		assertTrue(simpleNummber.equals("1"));
		assertTrue(numberDivBy3 == "Fizz");
		assertTrue(numberDivBy5 == "Buzz");
		assertTrue(numberDivBy3and5 == "FizzBuzz");
	}
}
