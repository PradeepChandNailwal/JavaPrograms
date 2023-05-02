package com.org.programs;

import java.util.Arrays;

public class AnagramsProgram {

	public static void main(String[] args) {
		String inputStr1 = "Tea";
		String inputStr2 = "Cat";

		inputStr1 = inputStr1.toLowerCase();
		inputStr2 = inputStr2.toLowerCase();

		if (inputStr1.length() == inputStr2.length()) {

			char[] charArray1 = inputStr1.toCharArray();
			char[] charArray2 = inputStr2.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(inputStr1 + " and " + inputStr2 + " are anagram.");
			} else {
				System.out.println(inputStr1 + " and " + inputStr2 + " are not anagram.");
			}
		} else {
			System.out.println(inputStr1 + " and " + inputStr2 + " are not anagram.");
		}
	}

}
