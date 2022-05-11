package com.learn;

import java.util.Scanner;

public class FiftyOddWhile {
	public static void main(String[] args) {
		int num1;
		int i=1;
		Scanner object=new Scanner(System.in);
		System.out.println("Enter Number");
		num1=object.nextInt();
		while (i<=num1) {
			System.out.println("First 50 Odd Numbers " + i);
			i=i+2;
		}
	}
}
