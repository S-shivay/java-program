package com.learn;

import java.util.Iterator;
import java.util.Scanner;

public class ForFirstFiftyEven {
	public static void main(String[] args) {
		int num1;
		Scanner object=new Scanner(System.in);
		System.out.println("Enter Number");
		num1=object.nextInt();
		for (int i=1; i<=num1; i++) {
			if(i%2 == 0) {
			System.out.println(i);}
			
		}
	}
}