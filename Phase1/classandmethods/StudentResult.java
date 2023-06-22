package classandmethods;

import java.util.Scanner;

//class is a blue print to create object. Class is a group of variables and methods
class Student{
	//instance variables
	private int rollno;
	private String name; //String is pre defined class in java.lang to store no of characters
	private int maths, english, hindi;

	// instance methods
	public void display(){
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
		System.out.println("Maths marks="+maths);
		System.out.println("english marks="+english);
		System.out.println("hindi="+hindi);

	}
	public void getInfo() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your rollno");
		rollno=scan.nextInt();
		System.out.println("Enter your name");
		name=scan.next();
		System.out.println("Enter maths marks");
		maths=scan.nextInt();
		System.out.println("Enter english marks");
		english=scan.nextInt();
		System.out.println("Enter hindi marks");
		hindi=scan.nextInt();
		
	}
	
	public String calcGrade(){
		String grade;//local variable
		int total=(maths+english+hindi)/3;
		if(total>=80)
			grade="A";
		else if(total>=60 && total<80)
			grade="B";
		else if(total>=40 && total<60)
			grade="C";
		else
			grade="fail";
		return grade;
	}
	

}
public class StudentResult {

	public static void main(String[] args) {
		Student obj1=new Student();//Constructor are special type of method which is having same name as class and provide intial values in obejct
		System.out.println(obj1);//classandmethods.Student@626b2d4a
		Student obj2=new Student();
		System.out.println(obj2);
		System.out.println("Please provide information about Student 1");
		obj1.getInfo();
		System.out.println("Please provide information about Student 2");
		obj2.getInfo();
		obj1.display();
		System.out.println("grade="+obj1.calcGrade());
		obj2.display();
		System.out.println("grade="+obj2.calcGrade());


	}

}
