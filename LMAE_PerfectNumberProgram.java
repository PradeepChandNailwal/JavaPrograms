package com.org.programs;

public class LMAE_PerfectNumberProgram {

	public static void main(String[] args) {
		
		long inputNumber = 28;		
		long sum = 0;		
		int i = 1;

		while (i <= inputNumber / 2) {
			
			if (inputNumber % i == 0) {
				sum = sum + i;
			}			
			i++;
		}

		if (sum == inputNumber) {
			System.out.println(inputNumber + " is a perfect number.");			
		} else {
			System.out.println(inputNumber + " is not a perfect number.");
		}
	}

}
