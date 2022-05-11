package com.learn;

import java.util.Scanner;

public class SwitchCaseAll {

		public static void main(String[] args) {
			System.out.println("Case 1: All 4 Arithmatic Operation in 1.");
			System.out.println("Case 2: Compare Two Number which is Larger by IF Else.");
			System.out.println("Case 3: Find Number is Even or Odd.");
			System.out.println("Case 4: Fifty or more only Odd number shown by While.");
			System.out.println("Case 5: Fifty or more only Even number shown by For.");
			System.out.println("Case 6: Multiple And Division Perform on Two Numbers.");
			System.out.println("Case 7: Find Simple Intrest.");
			System.out.println("Case 8: Find Square And Cube of same number.");
			int num1;
			Scanner object=new Scanner(System.in);
			System.out.println("Enter Number");
			num1=object.nextInt();
			
			switch (num1) {
			case 1: 
			int a,b;
			
			Scanner arith= new Scanner(System.in); //creating object to use a class
			System.out.println("Enter Number 1");
			a= arith.nextInt();
			System.out.println("Enter another number");
			b= arith.nextInt();
			
			int result= a+b; //+, -, *, / arithmetic operator
			System.out.println("Addition is "+result);
			int resultsub= a-b;
			System.out.println("Subtraction is "+resultsub);
			int resultmul= a*b;
			System.out.println("Multiplication is "+resultmul);
			int resultdiv= a/b;
			System.out.println("Divison is "+resultdiv); 
			break;
			case 2: 
				
			int c;
			int d;
			Scanner comlar=new Scanner(System.in);
			System.out.println("Enter First Number");
			c=comlar.nextInt();
			System.out.println("Enter Second Number");
			d=comlar.nextInt();
			if (c>d) {
				System.out.println("Greater Number is "+c);
			}else {
				System.out.println("Greater Number is "+d);
			} 
			break;
			case 3: 
				int e;
				Scanner eveod=new Scanner(System.in);
				System.out.println("Enter the number");
				e=eveod.nextInt();
				if (e%2 == 0) {
					System.out.println(e + " Number is Even");
				}
				else {
					System.out.println(e + " Number is odd");
				}
				break;
			case 4: 
				int f;
				int h=1;
				Scanner fifod=new Scanner(System.in);
				System.out.println("Enter Number");
				f=fifod.nextInt();
				while (h<=f) {
					System.out.println("First 50 Odd Numbers " + h);
					h=h+2;
				}
				break;
			case 5: 
				int i;
				Scanner fifeve=new Scanner(System.in);
				System.out.println("Enter Number");
				i=fifeve.nextInt();
				for (int j=1; j<=i; j++) {
					if(j%2 == 0) {
					System.out.println(j);}
					
				}
				break;
			case 6: 
				int k;
				int l;
				Scanner muldiv= new Scanner(System.in); //creating object to use a class
				System.out.println("Enter Number 1");
				k= muldiv.nextInt();
				System.out.println("Enter another number");
				l= muldiv.nextInt();
				int mul= k*l;
				System.out.println("Multiplication is "+mul);
				int div= k/l;
				System.out.println("Divison is "+div);
				break;
			case 7: 
				float m;
				float n;
				float o;
				Scanner si=new Scanner(System.in);
				System.out.println("Enter Initial Principal Balance");
				m=si.nextFloat();
				System.out.println("Enter Annual Intrest Rate");
				n=si.nextFloat();
				System.out.println("Enter Time(in years)");
				o=si.nextFloat();
				float re= (m*n*o)/100;
				System.out.println("Your Final Amount is = "+re);
				break;
			case 8:
				int p;
				Scanner sqcu= new Scanner(System.in); 
				System.out.println("Enter Number 1");
				p= sqcu.nextInt();
				int resultsqu=p*p;
				System.out.println("Square root of "+ num1 +" is = "+resultsqu);
				System.out.println("Cube root of "+ num1 +" is = "+(p*p*p));
				break;
			default:
				System.out.println("Enter Proper Number");
			}
		}
	}
