package exceptionhandling;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		//try with resource
		try(Scanner sc=new Scanner(System.in)) {
			System.out.println("enter a number");
			int num1=sc.nextInt();
			System.out.println("enter a number");
			int num2=sc.nextInt();
			System.out.println(num1/num2);
			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
