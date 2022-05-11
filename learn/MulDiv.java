package com.learn;
import java.util.Scanner;
public class MulDiv {
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner object= new Scanner(System.in); //creating object to use a class
		System.out.println("Enter Number 1");
		num1= object.nextInt();
		System.out.println("Enter another number");
		num2= object.nextInt();
		int resultmul= num1*num2;
		System.out.println("Multiplication is "+resultmul);
		int resultdiv= num1/num2;
		System.out.println("Divison is "+resultdiv);
	}
}
