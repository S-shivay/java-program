package com.learn;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int num1;
		Scanner object=new Scanner(System.in);
		System.out.println("Enter the number");
		num1=object.nextInt();
		if (num1%2 == 0) {
			System.out.println(num1 + " Number is Even");
		}
		else {
			System.out.println(num1 + " Number is odd");
		}
	}
}

