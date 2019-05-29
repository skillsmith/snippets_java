/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * An example of primitive data types
 */
package com.java.basics;

public class Primitives {
	//all whole numbers such as 100...
	static byte smallestOne;
	static short midSizeOne;
	static int mostWidelyUsed;			//any literal is by default int for Java
	static long astronomicalQuantities; //crazy big values!
	
	//store decimal numbers
	static float decimalNumberSmall;
	static double decimalNumberBig; 
	
	static char aSingleCharacter;		
	static boolean sayTrueOrFalse;		
	
	public static void main(String[] args) {
		
		smallestOne = 100;		
		midSizeOne = 10000;
		mostWidelyUsed = 1000000000;	
		astronomicalQuantities = 1000000000000000000L; //note the L. it is must
		
		decimalNumberSmall = 3.14F;		//as L for long, F for float
		decimalNumberBig = 1000000000000000000000.0000000000000000000001d; //crazy big values and fractions OK!
		
		//Non-numerics
		aSingleCharacter = 'Z';		//any character within '<single quote>'
		aSingleCharacter = '\n';	//whitespace chars OK besides alphanumerics
		aSingleCharacter = '\t';
		
		//special type
		sayTrueOrFalse=true;
		sayTrueOrFalse=false;
		byte x=10;
		byte y=10;
		if (sayTrueOrFalse) {;}		//a dummy statement to execute when true
		
	}
}