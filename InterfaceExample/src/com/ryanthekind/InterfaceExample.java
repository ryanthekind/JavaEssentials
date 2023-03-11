package com.ryanthekind;

interface WaterBottleInterface {
	String color = "Blue";
	
	void fillUp();
	void pourOut();
}

public class InterfaceExample implements WaterBottleInterface {

	public static void main(String[] args) {
		System.out.println(color);
		
		InterfaceExample ex = new InterfaceExample();
		ex.fillUp();
		ex.pourOut();
	}

	@Override // means it implements what's on line 6 & 7
	public void fillUp() {
		System.out.println("It is filled");
		
	}

	@Override
	public void pourOut() {
		System.out.println("It is poured out");
		
	}

}
