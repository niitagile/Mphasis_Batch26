package CollectionsExample;

import java.util.ArrayList;
class Employee{
	private int empcode;
	private String name;
	public Employee(int empcode, String name) {
		
		this.empcode = empcode;
		this.name = name;
	}
	public void display() {
		System.out.println("empcode="+this.empcode);
		System.out.println("name="+this.name);
	}
}
public class InstanceExample {

	public static void main(String[] args) {
		/*Employee emp1=new Employee(101,"Kiran");
		Employee emp2=new Employee(102,"Meena");
		Employee emp3=new Employee(103,"Karan");*/
		
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(101,"Kiran"));
		list.add(new Employee(102,"Meena"));
		list.add(new Employee(103,"Karan"));
		System.out.println(list);
		for(Employee emp : list) {
			emp.display();
		}
		
		

	}

}
