package com.org.programs;

public class FactorialProgramUsingRecursion {

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		
		int number = 4; // It is the number to calculate factorial
		
		int fact = 1;
		
		fact = factorial(number);
		
		System.out.println("Factorial of " + number + " is: " + fact);

	}

}
