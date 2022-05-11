package com.emailvalidation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation  {
public static void main(String[] args) {
        
        String regex="[a-zA-Z0-9_]+[@][a-z]+[.][a-z]{2,3}";
        Pattern patt= Pattern.compile(regex);
        String x[]=new String[3];
        
        Scanner s = new Scanner(System.in);
        for (int i = 0; i<3; i++)
        {
            System.out.println("Enter your email :-");
            x[i] = s.nextLine();
        }
        
        System.out.println("Array elements checking");
        
        for (int i = 0; i<3; i++)
        {
        	Matcher m= patt.matcher(x[i]);
        	if(m.matches())
                System.out.println(x[i]+" Valid");
            else
                System.out.println(x[i]+" Not Valid");
        }
        System.out.println("Enter any email to search :- ");
        String y=s.nextLine();
        int i;
        for (i = 0; i<3; i++)
        {
        	if(x[i].equals(y))
        	{	
        		System.out.println(y + " Found " + " at " + (i+1) + " Index ");
        		break;
        	}
        	
        }
        if(i==3)
        	System.out.println(y+ "Not found");
    }
	}
