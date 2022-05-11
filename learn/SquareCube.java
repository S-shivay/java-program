package com.learn;
import java.util.Scanner;
public class SquareCube {
	public static void main(String[] args) {
		int num1;
		Scanner object= new Scanner(System.in); //creating object to use a class
		System.out.println("Enter Number 1");
		num1= object.nextInt();
		int resultsqu=num1*num1;
		System.out.println("Square root of "+ num1 +" is = "+resultsqu);
		System.out.println("Cube root of "+ num1 +" is = "+(num1*num1*num1));
	}
}
