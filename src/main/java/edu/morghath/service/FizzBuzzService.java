package edu.morghath.service;

public class FizzBuzzService {
	private static final int BOTTOM_BORDER = 0;
	private static final int TOP_BORDER = 100;

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
			throw new Exception(
					"Es dürfen nur Zahlen im Intervall von[" + BOTTOM_BORDER + "," + TOP_BORDER + "] verwendet werden");
		}

		if (n % 5 == 0 && n % 3 == 0) {
			return "FizzBuzz";
		}

		if (n % 3 == 0) {
			return "Fizz";
		}

		if (n % 5 == 0) {
			return "Buzz";
		}

		return Integer.toString(n);
	}
}
