/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * An example of 
 */

package com.java.basics;


public class SuperClass {
	
	private String visibilityRestricted2Self = "See me? I can be seen only by myself";
	public String visibility2All = "See me? Yep! From anywhere in the jungle!!";
	protected String visibility2Children = "See me? Yes. But only down the family tree!!";
	String visibility2MyPack = "See me? Yes, by the fellow wolves of my pack!!";
	
	 public void scopeTester() {

		 System.out.println("Public member>> No restrictions>> " + visibility2All);
		 System.out.println("Protected member>> Only inheriting Sub-classes and within package>> " + visibility2Children);
		 System.out.println("Default member>> Only by classes within same package>> " + visibility2MyPack);
		 System.out.println("Private member>> Only by the declaring class>> " + visibilityRestricted2Self);
		
		saidoo();
		if (true){
			String visibleString = "See me? I can be seen at 'if block' level";
			System.out.println(visibleString);
		} //if ends here		

		do{
			String visibleString = "See me? I can be seen at 'while block' level";
			System.out.println(visibleString);
		}while (false);
		
		{
			String visibleString = "See me? I can be seen at 'dummy block' level";
			System.out.println(visibleString);
		}
		
	}

	 
	public void saidoo(){
		System.out.println("\n\nVariable Scope within the Class");
		String visibilityRestricted2Self = "See me? I can be seen at method level";
		System.out.println(visibilityRestricted2Self);
	} //saidoo ends here
	
}