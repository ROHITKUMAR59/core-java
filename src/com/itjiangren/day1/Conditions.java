package com.itjiangren.day1;

public class Conditions {
	public static void main(String[] args) {	
	
	}
	
	public static void caseSwitchShowCase() {
		int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
	}
	
	
	public static void ifElseShowCase() {
		
		boolean isTrue = true;
		if (isTrue) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		//isTrue could be expressions obviously
		int a = 1;
		int b = 0;
		
		if (a > b) {
			//
		} else if (a == b) {
			//
		} else if ( a < b) {
			//
		}
	}
	
	public static void ifElseShortCode() {
		boolean isTrue = true;
		
		// ? : operator
		System.out.println(isTrue ? "true" : "false");
	}
}
