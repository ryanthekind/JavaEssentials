package com.ryanthekind;

// base class
public class Towel {

	public String type;
	public String color;
	
	// Constructor
	public Towel(String type, String color) {
		this.type = type;
		this.color = color;
	}
	
	
	public String toString() {
		return ("This " + type + " towel is " + color);
	}
} // end of class
