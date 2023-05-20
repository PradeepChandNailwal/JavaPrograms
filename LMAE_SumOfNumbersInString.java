package com.org.programs;

public class LMAE_SumOfNumbersInString {

	public static void main(String[] args) {
		String inputStr = "4Pradeep7Chand3Nailwal";
		int sum = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (Character.isDigit(inputStr.charAt(i))) {
				sum = sum + Character.getNumericValue(inputStr.charAt(i));
			}				
		}
		System.out.println("Sum of all the digit present in String : " + sum);

	}

}
