package com.itjiangren.day1;

import java.util.Arrays;

public class Excercises1 {
	
	public static void main(String[] args) {
		Excercises1 excer = new Excercises1();
		int[] result = excer.fibonacci(10);
		
		Arrays.stream(result).forEach(System.out::println);
		
	}

	// 1,1,2,3,5,8,13 ...
	public int[] fibonacci(int number) {
		int first = 1;
		int second = 1;
		
		int[] fibonacci = new int[number];
		fibonacci[0] = first;
		fibonacci[1] = second;
		for (int i = 2; i<number; i++) {
			fibonacci[i] = first + second;
			first = fibonacci[i-1]; 
			second = fibonacci[i];
		}
		
		return fibonacci;
	}
	
	//题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位？
	public int baoShu(int total, int count) {
		//todo
		return 1;
	}
	
	//水仙花数，找出所有100-999的水仙花数
	//打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
	public int[] lilyNumber() {
		return null;
	}
	
	//题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
	public int[] findLCMNAndGCD(int m, int n) {
		return null;
	}
	
	//factorial recursive
	//n!
	public int calcFactorialLoop(int number) {
		return 0;
	}
	
	public int calcFactorialRecursive(int number) {
		return 0;
	}
}
