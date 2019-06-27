/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * An example of Access Modifier
 */

package com.java.level2;

import com.java.basics.SuperClass;

public class ScopeAndVisibility extends SuperClass{
	
	
	public static void main(String[] args) {

		SuperClass sAndVSuper = new SuperClass();
		ScopeAndVisibility sAndVObj = new ScopeAndVisibility();
		
		System.out.println("Accessing from main class\n");
		System.out.println(sAndVSuper.visibility2All);
		System.out.println(sAndVObj.visibility2Children);
		System.out.println(sAndVObj.visibility2MyPack);		//will keep complaining
		
	}
}