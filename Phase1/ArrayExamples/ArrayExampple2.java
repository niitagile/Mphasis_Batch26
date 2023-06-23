package ArrayExamples;

import java.util.Scanner;

public class ArrayExampple2 {

	public static void main(String[] args) {
		//Take 5 subjects marks and calculate their total
		int array[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		
		int total=0;
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
			total=total+array[i];
		}
		System.out.println("sum="+total);
	}

}
