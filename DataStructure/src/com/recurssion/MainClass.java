package com.recurssion;

public class MainClass {

	public static void main(String[] args) {

		int a = 4;

		int factOfa = factorial(a);

		System.out.println(factOfa);
	}

	private static int factorial(int a) {
		// TODO Auto-generated method stub
		if (a == 0) {
			return 1;
		}
		return a * factorial(a - 1);

	}
}
