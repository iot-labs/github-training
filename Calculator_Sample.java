package com.mycompany.test;

public class Calculator {

	public static void main(String[] args) {
		int a = 45;
		int b = 22;
		System.out.println(sum(a,b));
		System.out.println(minus(a,b));
		System.out.println(multi(a,b));
		System.out.println(division(a,b));
	}
	
	private static int sum(int a, int b) {
		int result = a+b;
		return result;
	}
	
	private static int minus(int a, int b) {
		int result = a-b;
		return result;
	}
	
	private static int multi(int a, int b) {
		int result = a*b;
		return result;
	}
	
	private static float division(int a, int b) {
		int result = a/b;
		return result;
	}

}
