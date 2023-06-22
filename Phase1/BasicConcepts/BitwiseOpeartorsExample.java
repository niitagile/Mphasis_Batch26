package BasicConcepts;

public class BitwiseOpeartorsExample {

	public static void main(String[] args) {
		//bitwise operators & ,|, ^, >>,<<, >>>, ~
		
		int x=5;
		int y=3;
		System.out.println(x & y);  //
		System.out.println(x |y);
		System.out.println(x^ y);
		System.out.println(x>>3); //0101 0011 0001 0000
		System.out.println(x<<3);//0101 1010 0100 
		System.out.println(x>>>3);
		
		System.out.println(~x);

	}

}

/*
5= 0101
3= 0011
&= 0001=>1
|= 0111=>7
^= 0110=>6
>>   5/2=2  2/2=1  1/2=0

<<   5*2=10  10*2=20  20*2=40

*/