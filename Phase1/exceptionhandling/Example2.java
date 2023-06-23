package exceptionhandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("num="+num);
		
		System.out.println("Enter a string");
		String s=sc.next();
		int num1=Integer.parseInt(s);
		System.out.println("num1="+num1);
		}
		catch(InputMismatchException|NumberFormatException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End of program");

	}

}
