package com.itjiangren.day1;

public class Strings {
	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		
		if (a == b) {
			System.out.println("a == b");
		} else {
			System.out.println("a != b");
		}
		
		
		String aa = new String("abc");
		String bb = new String("abc");
		
		if (aa == bb) {
			System.out.println("aa == bb");
		} else {
			System.out.println("aa != bb");
		}
		
		// We will come back to visit this. As string is ultra important

		
		String aabb = "abcabc";
		String aabbConcat = aa.concat(bb); // aa+bb
		
		if (aabb == aabbConcat) {
			System.out.println("aabb == aabbConcat");
		} else {
			System.out.println("aabb != aabbConcat");
		}
		
		// make sure you are using equals for strings!!!
		// please bear in mind. Ultra important
		// One catch for Java. Lots of ppl struggle to understand
		
		
		if (aabb.equals(aabbConcat)) {
			System.out.println("aabb == aabbConcat");
		} else {
			System.out.println("aabb != aabbConcat");
		}
	}
}
