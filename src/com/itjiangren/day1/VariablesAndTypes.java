package com.itjiangren.day1;

public class VariablesAndTypes {
	
	
	public static void main(String[] args) {
		// common the primitives
		int number = 10;
		float fNumber = 10.0f;
		double d = 4.5;
		boolean isRight = true;
		char a = 'a';
		
		String str = "This is a String";
		
		System.out.println("number:" + number);
		System.out.println("fNumber:" + fNumber);
		System.out.println("d:" + d);
		System.out.println("isRight:" + isRight);
		System.out.println("a:" + a);
		System.out.println("String:" + str);
		
		// Autoboxing and unBoxing
		
		Integer numberObj = number;
		Float fNumberObj = fNumber;
		Double dObj = d;
		Boolean isRightObj = isRight;
		Character aObj = a;
		
		System.out.println("numberObj:" + numberObj);
		System.out.println("fNumberObj:" + fNumberObj);
		System.out.println("dObj:" + dObj);
		System.out.println("isRightObj:" + isRightObj);
		System.out.println("aObj:" + aObj);
		
		
				
	}

}
