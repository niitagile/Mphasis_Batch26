package exceptionhandling;

public class Example5 {

	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			//System.exit(0); finally will not execute if this statement runs
		}
		finally {
			System.out.println("Code End");
		}

	}

}
