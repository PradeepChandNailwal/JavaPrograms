package com.org.programs;

public class LMAE_FactorialProgram {

	public static void main(String[] args) {
		
		int inputNumber = 3;
		
		int factorial = 1;		

		for (int i = 1; i <= inputNumber; i++) {

			factorial = factorial * i;

		}

		System.out.println("Factorial of " + inputNumber + " is: " + factorial);

	}

}
