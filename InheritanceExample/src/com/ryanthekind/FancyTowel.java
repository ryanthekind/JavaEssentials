package com.ryanthekind;

public class FancyTowel extends Towel{
	
	public int price;

	public FancyTowel(String type, String color, int price) {
		// invokes base class constructor
		super(type, color);
		this.price = price;
	}
	
	// method
	public void setPrice(int newPrice) {
		
		price = newPrice;
	}
	
	@Override public String toString() {
		return (super.toString() + "\nwhich cost me $" + price + ".");
	}
} // end of class
