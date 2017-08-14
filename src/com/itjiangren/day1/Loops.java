package com.itjiangren.day1;

import java.util.Arrays;

public class Loops {
	public static void main(String[] args) {
		//First For Loop
		int[] intArr = {1,2,3,4,5};
		
		for (int i = 0; i < intArr.length; i++) {
			if (i == intArr.length-1) {
				System.out.print(intArr[i] + "\n");
			} else
				System.out.print(intArr[i] + ",");		
		}
		
		
		//Second for Loop losing index ...
		String[] strArr = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		for (String month : strArr) {
			System.out.println(month);
		}
		
		//while, do, sometimes are very useful.
		int i = 0;
		while(i < strArr.length) {
			if (i == intArr.length-1) {
				System.out.print(intArr[i] + "\n");
			} else
				System.out.print(intArr[i] + ",");	
			
			i++;
		}
		
		//Java 8 foreach
		
		Arrays.stream(strArr).forEach(System.out::println);
		Arrays.stream(strArr).forEach(month -> System.out.println(month));
		
	}
}
