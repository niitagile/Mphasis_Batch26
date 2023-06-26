package exceptionhandling;
//check for user is eligible for voting or not

import java.util.Scanner;
class VotingAgeException extends Exception{
	static public boolean isEligible(int age) {
		if(age>18)
			return true;
		else
			return false;
	}
}

public class Example6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		try {
		if(VotingAgeException.isEligible(age)) 
			System.out.println("You are Eligible for voting");
		else
			throw new VotingAgeException();
		
		}catch(VotingAgeException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}



//Take capitalof india as input. If it is not Delhi then throw an Exception- 10 min

