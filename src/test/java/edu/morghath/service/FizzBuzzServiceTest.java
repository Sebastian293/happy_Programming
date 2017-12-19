package edu.morghath.service;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzServiceTest {
	private static final int BOTTOM_BORDER = 0;
	private static final int TOP_BORDER = 100;

	@Rule
	public ExpectedException thrown = ExpectedException.none();

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

	@Test
	public void fizzBuzzBorderTest() throws Exception {
		String bottomBorder = FizzBuzzService.fizzBuzz(BOTTOM_BORDER);
		String topBorder = FizzBuzzService.fizzBuzz(TOP_BORDER);

		assertTrue(bottomBorder == "FizzBuzz");
		assertTrue(topBorder == "Buzz");
	}

	@Test
	public void fizzBuzzOutOfBottomBorderTest() throws Exception {
		thrown.expect(Exception.class);
		thrown.expectMessage(
				"Es dürfen nur Zahlen im Intervall von[" + BOTTOM_BORDER + "," + TOP_BORDER + "] verwendet werden");

		FizzBuzzService.fizzBuzz(BOTTOM_BORDER - 1);
	}

	@Test
	public void fizzBuzzOutOfTopBorderTest() throws Exception {
		thrown.expect(Exception.class);
		thrown.expectMessage(
				"Es dürfen nur Zahlen im Intervall von[" + BOTTOM_BORDER + "," + TOP_BORDER + "] verwendet werden");

		FizzBuzzService.fizzBuzz(TOP_BORDER + 1);
	}
}
