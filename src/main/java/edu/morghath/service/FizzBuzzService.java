package edu.morghath.service;

public class FizzBuzzService {

	/**
	 * Takes an Integer between 0 and 100 and returns 'Fizz', 'Buzz', 'FizzBuzz' or the Integer.
	 * 
	 * @param n
	 *            the parameter you want to test. (Must be between 0 and 100)
	 * @return Fizz if n is divideble by 3, Buzz if n is divideble by 5, FizzBizz if
	 *         both, else n
	 */
	public static String fizzBuzz(int n) {
		if(n % 5 == 0 && n % 3 == 0){
			return "FizzBuzz";
		}
		
		if(n % 3 == 0) {
			return "Fizz";
		}
		
		if(n % 5 == 0) {
			return  "Buzz";
		}
		
		return Integer.toString(n);
	}
}
