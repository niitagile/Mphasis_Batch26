package CollectionsExample;

public class StackUsingLinkedList {
	Node top=null;
	class Node{
		int data;
		Node next;
		
	}
	
	 void push(int x) {
		Node new_node=new Node();
		new_node.data=x;
		new_node.next=top;
		top=new_node;
		
	}
	boolean isEmpty(){
		return top==null;
	}
	void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else
		{
			for(Node temp=top;temp!=null;temp=temp.next) {
				System.out.println(temp.data);
			}
		}
	}
	void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else
			System.out.println("Peek value="+top.data);
	}
	void pop() {
		if(isEmpty())
			System.out.println("Underflow");
		else
		{
			
		System.out.println("Value deleted="+top.data);
			top=top.next;
		}
	}
	public static void main(String[] args) {
		StackUsingLinkedList st=new StackUsingLinkedList();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.display();
		st.peek();
		st.pop();
		st.display();
		

	}

}
