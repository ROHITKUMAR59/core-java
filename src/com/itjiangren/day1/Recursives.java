package com.itjiangren.day1;

public class Recursives {

	public static void solve(int n, String start, String mid, String end) {
	       if (n == 1) {
	           System.out.println(start + " -> " + end);
	       } else {
	           solve(n - 1, start, end, mid);
	           System.out.println(start + " -> " + end);
	           solve(n - 1, mid, start, end);
	       }
	   }

	   public static void main(String[] args) {
		   Recursives.solve(3, "A", "B", "C");
	   }
}
