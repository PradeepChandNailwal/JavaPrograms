package com.org.programs;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		String inputStr = "4Pradeep7Chand3Nailwal";
		int sum = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (inputStr.charAt(i) >= '0' && inputStr.charAt(i) <= '9') {				
				String character = inputStr.charAt(i) + "";
				int characterValue = Integer.parseInt(character);
				sum = sum + characterValue;
			}
		}
		System.out.println("Sum of all the digit in String : " + sum);
	}

}
