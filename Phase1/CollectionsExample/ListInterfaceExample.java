package CollectionsExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterfaceExample {

	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> list =new ArrayList<>();
		list.add("Heena");
		list.add("Manish");
		list.add("Babita");
		list.add("Kavish");
		list.add(null);
		list.add("Heena");
		System.out.println("ArrayList Elements:" + list);
		
		//LinkedList
		LinkedList<String> nlist =new LinkedList<>();
		nlist.add("Heena");
		nlist.add("Manish");
		nlist.add("Babita");
		nlist.add("Kavish");
		nlist.add(null);
		nlist.add("Heena");
		System.out.println("LinkedList Elements:" + nlist);
		
		//Vector
		Vector<String> vlist =new Vector<>();
		vlist.add("Heena");
		vlist.add("Manish");
		vlist.add("Babita");
		vlist.add("Kavish");
		vlist.add(null);
		vlist.add("Heena");
		System.out.println("Vector Elements:" + vlist);
		//stack
		Stack<String> stack =new Stack<>();
		stack.add("Heena");
		stack.add("Manish");
		stack.add("Babita");
		stack.add("Kavish");
		stack.add(null);
		System.out.println("Stack Elements:" + stack.peek());
		
		System.out.println("stack size before pop="+stack.size());
		System.out.println("Stack Elements:" + stack.pop());
		System.out.println("Stack Elements:" + stack.pop());
		System.out.println("Stack Elements:" + stack.pop());
		System.out.println("Stack Elements:" + stack.pop());
		System.out.println("stack size after pop ="+stack.size());
}

	

}
