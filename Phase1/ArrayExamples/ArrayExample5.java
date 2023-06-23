package ArrayExamples;

import java.util.Scanner;

//Array of Objects

class Person{
	String name;

	public Person(String name) {
		
		this.name = name;
	}
	public void display() {
		System.out.println("Person's name="+name);
	}
}

public class ArrayExample5 {
	public static void main(String[] args) {
			//Person p1=new Person("Kavita");
			//Person p2=new Person("Monica");
			//Person p3=new Person("Reena");
			
			Person obj[]=new Person[3];
			obj[0]=new Person("Kavita");
			obj[1]=new Person("Monica");
			obj[2]=new Person("Reena");
			
			for(int i=0;i<obj.length;i++) {
				obj[i].display();
			}
			
			
			
	}
}
