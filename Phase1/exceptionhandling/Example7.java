package exceptionhandling;
//check for user is eligible for voting or not

import java.util.Scanner;
class VotingAgeException1 extends Exception{
	static public boolean isEligible(String ans) {
		if(ans.equalsIgnoreCase("Delhi"))
			return true;
		else
			return false;
	}
}

public class Example7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter capital of India");
		String ans=sc.next();
		try {
		if(VotingAgeException1.isEligible(ans)) 
			System.out.println("Write Answer");
		else
			throw new VotingAgeException();
		
		}catch(VotingAgeException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}



//Take capitalof india as input. If it is not Delhi then throw an Exception- 10 min

