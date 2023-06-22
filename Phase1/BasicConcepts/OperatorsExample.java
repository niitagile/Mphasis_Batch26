package BasicConcepts;

public class OperatorsExample {

	public static void main(String[] args) {
		int x=2,y=9;
		//Relational Operator  != > < >= <= ==
		System.out.println(x==y); 
		
		//Arithmetic Operators + - * / %
		System.out.println("Q="+ (y/x));
		System.out.println("R="+(y%x));
		//Logical Operators && || !
		System.out.println(x>y && x==2);
		System.out.println(x>y || x==2);
		System.out.println(!(x>y)); //reverse answer
		
		//increment/decrement Operators (unary) ++, --
		int num=1;
		int z=num++; // put nm value in z and then increase num
		System.out.println("post z="+z); //1
		System.out.println("post num="+num);
		num=1;
		z=++num; //increase num and then put value in z
		System.out.println("pre z="+z);
		System.out.println("pre num="+num);
		
		//Assignment operator =
		
		
		
		
		
		
		//ternary operator or conditional operator ?:
		System.out.println("greater number="+(x>y?x:y));
		System.out.println(x%2==0?"even": "odd");

	}

}
