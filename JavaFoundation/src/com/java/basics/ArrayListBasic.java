package com.java.basics;

import java.util.ArrayList;						//PS. This import is MUST

public class ArrayListBasic {


	public static void main(String[] args) {
		ArrayList<Integer> roster = new ArrayList<Integer>();
		
		roster.add(101123);
		roster.add(202123);
		roster.add(303123);

		for (int employee : roster){
			System.out.println(employee + " \n");
		}
		
	
		if (roster.contains(303123)) System.out.println("Got him!");
		
		
	}

}