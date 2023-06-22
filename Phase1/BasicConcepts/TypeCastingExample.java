package BasicConcepts;

public class TypeCastingExample {

	public static void main(String[] args) {
		byte num1=89;
		byte num2=90;
		byte ans=(byte)(num1+num2);//forcefully convert larger data to small-- explicit typecasting
		int result=num1+num2;
		
		//Implicit data conversion
		int num3=6;
		float num4=9.8f;
		float sum=num3+num4; //6.0f+9.8f
		
		//explicit
		int sum1=(int)(num3+num4); //6.0f+9.8f=15
		
		
		char ch='A';
		int con=ch;
		System.out.println(con);//ascii code
		
		int num=70;
		char ch1=(char)num;
		System.out.println(ch1);
		
		
		
	}

}
