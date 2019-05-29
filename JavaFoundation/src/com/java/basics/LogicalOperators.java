/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * An example of Logical Operators
 */
package com.java.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogicalOperators {
	char option;
	boolean choice1;
	boolean choice2;
	boolean choice4Opposite;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		LogicalOperators logicalOperators = new LogicalOperators();

		System.out.println("Please provide answers as true or false");

		// AND and OR operators
		do {
			System.out.println("Pizza is originally Italian");
			logicalOperators.choice1 = Boolean.parseBoolean(logicalOperators.br.readLine());
			System.out.println("Pisa tower is aslant");
			logicalOperators.choice2 = Boolean.parseBoolean(logicalOperators.br.readLine());

			if (logicalOperators.choice1 && logicalOperators.choice2) {
				System.out.println("Answered both correctly");
			} else if (logicalOperators.choice1 || logicalOperators.choice2) {
				System.out.println("Answered one correctly");
			} else {
				System.out.println("Answered both incorrectly");
			}
			System.out.println("Please enter 'x' to quit, 'c' to continue");
			logicalOperators.option = (char) logicalOperators.br.readLine().charAt(0);

		} while (logicalOperators.option != 'x');
		
		System.out.println("Just you finished learning *AND* and *OR* operators");

		// *NOT* operator
		System.out.println("I am Mr. Opposite. You true, I will say false and vice versa");
		do {
			System.out.println("Say true or false");
			logicalOperators.choice4Opposite = Boolean.parseBoolean(logicalOperators.br.readLine());
			System.out.println("Opposite is " + !logicalOperators.choice4Opposite);

			System.out.println("Please enter 'x' to quit, 'c' to continue");
			logicalOperators.option = (char) logicalOperators.br.readLine().charAt(0);

		} while (logicalOperators.option != 'x');
		System.out.println("Just you finished *NOT* operators");
	} //main method ends here

}//Logical Operators ends here