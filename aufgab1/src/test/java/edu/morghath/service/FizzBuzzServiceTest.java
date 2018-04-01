package edu.morghath.service;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzServiceTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void fizzBuzzSimpleValuesTest() throws Exception {
		String simpleNummber = FizzBuzzService.fizzBuzz(1);
		String numberDivBy3 = FizzBuzzService.fizzBuzz(36);
		String numberDivBy5 = FizzBuzzService.fizzBuzz(80);
		String numberDivBy3and5 = FizzBuzzService.fizzBuzz(45);

		assertTrue(simpleNummber.equals("1"));
		assertTrue(numberDivBy3 == FizzBuzzService.DIV_BY_3);
		assertTrue(numberDivBy5 == FizzBuzzService.DIV_BY_5);
		assertTrue(numberDivBy3and5 == FizzBuzzService.DIV_BY_3_AND_5);
	}

	@Test
	public void fizzBuzzBorderTest() throws Exception {
		String bottomBorder = FizzBuzzService.fizzBuzz(FizzBuzzService.BOTTOM_BORDER);
		String topBorder = FizzBuzzService.fizzBuzz(FizzBuzzService.TOP_BORDER);

		assertTrue(bottomBorder == "FizzBuzz");
		assertTrue(topBorder == "Buzz");
	}

	@Test
	public void fizzBuzzOutOfBottomBorderTest() throws Exception {
		thrown.expect(Exception.class);
		thrown.expectMessage(FizzBuzzService.OUT_OF_BORDER_EXEPTION);

		FizzBuzzService.fizzBuzz(FizzBuzzService.BOTTOM_BORDER - 1);
	}

	@Test
	public void fizzBuzzOutOfTopBorderTest() throws Exception {
		thrown.expect(Exception.class);
		thrown.expectMessage(FizzBuzzService.OUT_OF_BORDER_EXEPTION);

		FizzBuzzService.fizzBuzz(FizzBuzzService.TOP_BORDER + 1);
	}
}
