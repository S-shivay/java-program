package com.learn;

import java.util.Scanner;

public class SimpleIntrest {
	public static void main(String[] args) {
		float num1;
		float num2;
		float num3;
		Scanner object=new Scanner(System.in);
		System.out.println("Enter Initial Principal Balance");
		num1=object.nextFloat();
		System.out.println("Enter Annual Intrest Rate");
		num2=object.nextFloat();
		System.out.println("Enter Time(in years)");
		num3=object.nextFloat();
		float result= (num1*num2*num3)/100;
		System.out.println("Your Final Amount is = "+result);
	}
}
