package com.learn;
import java.util.Scanner;
public class all {
	public static void main(String[] args) {
		int num,num1,num2;
		System.out.println("Case 1: To Add Values.");
		System.out.println("Case 2: To Subtract Values.");
		System.out.println("Case 3: To Multiply Values.");
		System.out.println("Case 4: To Divide Values.");
		Scanner object= new Scanner(System.in); //creating object to use a class
		System.out.println("Enter Number");
		num= object.nextInt();
		System.out.println("Enter Number 1");
		num1= object.nextInt();
		System.out.println("Enter another number");
		num2= object.nextInt();
		switch(num) {
		case 1:
			int result= num1+num2; //+, -, *, / arithmetic operator
			System.out.println("Addition is "+result);
			break;
		case 2: 
			int resultsub= num1-num2;
			System.out.println("Subtraction is "+resultsub);
			break;
		case 3:
			int resultmul= num1*num2;
			System.out.println("Multiplication is "+resultmul);
			break;
		case 4:
			int resultdiv= num1/num2;
			System.out.println("Divison is "+resultdiv);
			break;
		default:
			System.out.println("Enter Proper Number");
		}
		
		
		
		
		
	}
	
}

