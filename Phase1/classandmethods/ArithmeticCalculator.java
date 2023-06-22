package classandmethods;

import java.util.Scanner;

class Calculator{
	int num1,num2, ans;

	void getValues() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Ist Value");
		num1=sc.nextInt();
		System.out.println("Enter IInd Value");
		num2=sc.nextInt();
	}

	int addition() {
		return num1+num2;
	}
	int subtraction() {
		return num1-num2;
	}
	int multiplication() {
		return num1*num2;
	}
	int division() {
		if(num2==0)
			return 0;
		else
			return num1/num2;
	}
	int modulus() {
		return num1%num2;
	}
}
public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator calc=new Calculator();
		int choice;
		while(true)
		{
			

			System.out.println("enter your choice 1. Add 2. Sub 3. Mult 4. Div 5. Remainder 0. exit ");
			choice=sc.nextInt();
			if(choice !=0)
				calc.getValues();
			switch(choice) {
			case 1 : System.out.println("sum="+calc.addition()); break;
			case 2 : System.out.println("Difference="+calc.subtraction()); break;
			case 3 : System.out.println("product="+calc.multiplication()); break;
			case 4 : System.out.println("Questiont="+calc.division()); break;
			case 5 : System.out.println("Remainder="+calc.modulus()); break;
			case 0 : System.exit(0);
			default : System.out.println("put choice in between 1 to 5");
			}
		}

	}

}
