package com.example.project;

public class Date_Exploration_And_Type_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int intVar = 42;
	        float floatVar = 3.14f;
	        double doubleVar = 12345.6789;
			char charVar = 'A';
	        boolean boolVar = true;
				   System.out.println("===== Output Formatting =====");
				   System.out.printf("Integer (int): %d%n", intVar);
				   System.out.printf("Float (float): %.2f%n", floatVar); // 2 decimal place
				   System.out.printf("Double (double): %.3f%n", doubleVar); // 3 decimal places
				   System.out.printf("Character (char): %c%n", charVar);
				   System.out.printf("Boolean (boolean): %b%n", boolVar);
				   System.out.println();
				   System.out.println("===== Type Conversion =====");
	       int doubleToInt = (int) doubleVar;
	               System.out.printf("Casting double (%.3f) to int: %d%n", doubleVar, doubleToInt);
	       char intToChar = (char) intVar;
		           System.out.printf("Casting int (%d) to char: %c%n", intVar, intToChar);
		   int charToInt = (int) charVar;
				   System.out.printf("Casting char ('%c') to int: %d%n", charVar, charToInt);
				   System.out.println();
				   System.out.println("===== String Conversion =====");
		   String intToString = String.valueOf(intVar);
           String doubleToString = String.valueOf(doubleVar);
   		           System.out.printf("Converting int (%d) to String: %s%n", intVar, intToString);
			       System.out.printf("Converting double (%.3f) to String: %s%n", doubleVar, doubleToString);
		   String intString = "100";
				           String doubleString = "123.45";
		   int stringToInt = Integer.parseInt(intString);
		   double stringToDouble = Double.parseDouble(doubleString);
			       System.out.printf("Converting String ('%s') to int: %d%n", intString, stringToInt);
			       System.out.printf("Converting String ('%s') to double: %.2f%n", doubleString, stringToDouble);
				        try {
				            String invalidString = "abc";
				            int invalidToInt = Integer.parseInt(invalidString);
				            System.out.printf("Converting invalid String ('%s') to int: %d%n", invalidString, invalidToInt);
							} catch (NumberFormatException e) {
				            System.out.println("Error: Invalid input for numeric conversion!");
				        }

	}

}
