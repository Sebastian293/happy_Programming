package edu.morghath.service;

public class FizzBuzzService {
	public static final int BOTTOM_BORDER = 0;
	public static final int TOP_BORDER = 100;
	
	public static final String DIV_BY_3 = "Fizz";
	public static final String DIV_BY_5 = "Buzz";
	public static final String DIV_BY_3_AND_5 = "FizzBuzz";
	
	public static final String OUT_OF_BORDER_EXEPTION = "Es dürfen nur Zahlen im Intervall von[" + BOTTOM_BORDER + ","
			+ TOP_BORDER + "] verwendet werden";

	/**
	 * Takes an Integer between 0 and 100 and returns 'Fizz', 'Buzz', 'FizzBuzz' or
	 * the Integer.
	 * 
	 * @param n
	 *            the parameter you want to test. (Must be between 0 and 100)
	 * @return Fizz if n is divideble by 3, Buzz if n is divideble by 5, FizzBizz if
	 *         both, else n.
	 * @throws Exception
	 *             if n is not betwenn the BOTTOM_BORDER and TOP_BORDER
	 */
	public static String fizzBuzz(int n) throws Exception {
		if (n < BOTTOM_BORDER || n > TOP_BORDER) {
			throw new Exception(OUT_OF_BORDER_EXEPTION);
		}

		if (dividable(n, 5) && dividable(n, 3)) {
			return DIV_BY_3_AND_5;
		}

		if (dividable(n, 3)) {
			return DIV_BY_3;
		}

		if (dividable(n, 5)) {
			return DIV_BY_5;
		}

		return Integer.toString(n);
	}

	private static boolean dividable(int dividend, int divisor) {
		return dividend % divisor == 0;
	}
}
