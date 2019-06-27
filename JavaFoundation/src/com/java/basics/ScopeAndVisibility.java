/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * An example of Access Modifier
 */

package com.java.basics;


public class ScopeAndVisibility {
	public static final String A_GLOBAL_CONSTANT = "SET IN STONE";
	
	public static void main(String[] args) {

		SuperClass sAndVSuper = new SuperClass();
		sAndVSuper.scopeTester();
		
		System.out.println("Accessing from main class\n");
		System.out.println(sAndVSuper.visibility2All);
		System.out.println(sAndVSuper.visibility2Children);
		System.out.println(sAndVSuper.visibility2MyPack);
		
		
	}
}