package com.itjiangren.day1;

public class Methods {

	
	public static void main(String[] args) {
		Methods methods = new Methods();
		String s1 = "a";
		String s2 = "b";
		methods.swap(s1, s2);
		
		System.out.println(s1 + " " + s2);		
	}
	
	
	public void test() {
		// test
	}
	
	public String test2() {
		return "test2";
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	
	public void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
	
	
	public void swap(String a, String b) {
		String tmp = a;
		a = b;
		b = tmp;
	}
	
	public void tricky(Point arg1, Point arg2)
	{
	  arg1.x = 100;
	  arg1.y = 100;
	  Point temp = arg1;
	  arg1 = arg2;
	  arg2 = temp;
	}

}

class Point {
	int x;
	int y;
}
