/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * An example of arrays
 */
package com.java.basics;

public class ArraysBasic {

	byte smallestOne=100;
	byte[] manySmalls = new byte[10];
	
	char[] charcters = {'H', 'e', 'l', 'l'};
	
	public static void main(String[] args) {
		ArraysBasic obj = new ArraysBasic();
		
		obj.manySmalls[0]=10;	//PS. zero-indexed. Position in the carton box counted from 0 (ZERO)
		obj.manySmalls[9]=100;	//by above last position is always always size minus 1
		
		System.out.println("First charcter in characters array is "+obj.charcters[0]);

/*		for(int counter=0; counter<obj.charcters.length;counter++){
			System.out.print(counter);
			System.out.print(obj.charcters[counter]);
			System.out.println("");
		}
*/		
		/*
		 * for each item in array
		 * 		do this
		 */
		//Shan
		for(byte character : obj.manySmalls){
			System.out.print(character); //printed
			//also add the number ==> cumulative sum
		}
		
	}
}