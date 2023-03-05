package com.ryanthekind;

/**
 * Description: The purpose of this exercise is to demonstrate how
 * inhertence works in Java.
 * 
 * Inheritance is a technique that allows us to define classes that capture
 * the common properties and functions of several related classes
 * 
 * Geeksforgeeks.org says we need Inheritance for 3 reasons:
 * - Code Reusability
 * - Method Overriding
 * - Abstraction
 * @author ryanb
 *
 */

public class myClass {

	public static void main(String[] args) {
		
		FancyTowel llBean = new FancyTowel("hand", "blue", 30);
		System.out.println(llBean.toString());
	}

}
