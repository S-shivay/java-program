package com.learn;

import java.util.Scanner;

public class CompareLarger {
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner object=new Scanner(System.in);
		System.out.println("Enter First Number");
		num1=object.nextInt();
		System.out.println("Enter Second Number");
		num2=object.nextInt();
		if (num1>num2) {
			System.out.println("Greater Number is "+num1);
		}else {
			System.out.println("Greater Number is "+num2);
		}
	}
}

