package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {

	static void getData()throws InputMismatchException,ArrayIndexOutOfBoundsException  {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("num="+num);
		int arr[]= {1};
		System.out.println(arr[2]);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			getData();
		
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


