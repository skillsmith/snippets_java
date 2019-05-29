/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * An example of Miscellaneous Operators
 */
package com.java.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiscellaneousOperators {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numeroUno;
		int numeroDos;
		
		System.out.println("Please provide first number");
		numeroUno = Integer.parseInt(br.readLine());
		
		System.out.println("Please provide second number");
		numeroDos = Integer.parseInt(br.readLine());
		
		//equal to
		if(numeroUno == numeroDos){
			System.out.println("first number is *EQUAL TO* second number");
		}
		//not equal to
		if(numeroUno != numeroDos){
			System.out.println("first number is *NOT EQUAL TO* second number");
		}		
		//greater Than
		if(numeroUno > numeroDos){
			System.out.println("first number is *GREATER THAN* second number");
		}		
		//less than
		if(numeroUno < numeroDos){
			System.out.println("first number is *LESS THAN* second number");
		}		
		//greater than or equal to
		if(numeroUno >= numeroDos){
			System.out.println("first number is *GREATER THAN OR EQUAL TO* second number");
		}		
		//less than or equal to
		if(numeroUno <= numeroDos){
			System.out.println("first number is *LESS THAN OR EQUAL TO* second number");
		}				
		//increment
		System.out.println("INCREMENT first number >>" + ++numeroUno);
		
		//decrement
		System.out.println("DECREMENT second number >>" + numeroDos--);
		
		//ternary
		String storeOnlyWhenEqual = numeroUno==numeroDos ? "Equality prevails" : "Inequality persists"; 
		System.out.println("\n" + storeOnlyWhenEqual);
		System.out.println("\net voila! You breezed thru miscellaneous operators");
	} //main method ends here

}//Miscellaneous Operators ends here