package inerfaceexamples;

public class ArithmeticCalculator implements Calculator {

	@Override
	public int addition(int num1, int num2) {
		
		return num1 + num2;
	}

	@Override
	public int subtraction(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

}
