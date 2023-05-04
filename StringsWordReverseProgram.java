package com.org.programs;

import java.util.regex.Pattern;

public class StringsWordReverseProgram {

	public static void main(String[] args) {	
		
		String inputStr = "Lets Make Automation Easy";
				
		Pattern pattern = Pattern.compile("\\s");
		
		String[] inputStrArray = pattern.split(inputStr);
        String reversedString = "";
        
        for (int i = inputStrArray.length-1; i >=0; i--) {
        	
            if (i == inputStrArray.length - 1) {
            	reversedString = reversedString + inputStrArray[i];
            } else {
            	reversedString = reversedString + " " + inputStrArray[i];
            }
        }
        
        System.out.println(reversedString);

	}

}
