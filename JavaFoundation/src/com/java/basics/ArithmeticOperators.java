/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * An example of arithmetic operators
 */

package com.java.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticOperators {
	char option;
	String operator;
	int operandOne;
	int operandTwo;
	float result;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
		System.out.println("Select one of the following arithmetic operation");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		arithmeticOperators.operator = arithmeticOperators.br.readLine();
		System.out.println("Please enter 'x' to quit, 'c' to continue");
		arithmeticOperators.option = (char) arithmeticOperators.br.readLine().charAt(0);

		while (arithmeticOperators.option != 'x') {
			System.out.println("Enter your first operand");
			arithmeticOperators.operandOne = Integer.parseInt(arithmeticOperators.br.readLine());
			System.out.println("Enter your second operand");
			arithmeticOperators.operandTwo = Integer.parseInt(arithmeticOperators.br.readLine());

			switch (arithmeticOperators.operator) {
			case "+":
				arithmeticOperators.result = arithmeticOperators.operandOne + arithmeticOperators.operandTwo;
				System.out.println(arithmeticOperators.result);
				break;
			case "-":
				arithmeticOperators.result = arithmeticOperators.operandOne - arithmeticOperators.operandTwo;
				System.out.println(arithmeticOperators.result);
				break;
			case "*":
				//'*'
				System.out.println("");
			case "/":
				//'/'
				System.out.println("divide");
			default:
				System.out.println("Operator is incorrect. Please check");
				
			}

			System.out.println("Please enter 'x' to quit, 'c' to continue");
			arithmeticOperators.option = (char) arithmeticOperators.br.readLine().charAt(0);

		}
		System.out.println("bye");
	}//main method ends here
} //class ends here