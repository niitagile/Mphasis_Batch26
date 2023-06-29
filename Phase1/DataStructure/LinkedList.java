package sortingandsearching;

public class LinkedList {
	
	Node head;
	static class Node{
		int data;
		Node next;//Reference Object
		Node (int data){
			this.data=data;
			this.next=null;
		}
		
	}//Node class End
	
	public static LinkedList insert(LinkedList list, int data) {
		//create a new node with given data
		Node new_node=new Node(data);
		//if head is null- insert address of first node in head
		if(list.head==null)
			list.head=new_node;
		else {
			Node last;
			for(last=list.head;last.next!=null;last=last.next) {}
				last.next=new_node;
			
		}
	
	return list;
	}
	
	
	public static void print(LinkedList list ) {
		for(Node last=list.head;last!=null;last=last.next) {
			System.out.print(last.data+" ");
		}
	}
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list=insert(list,23);
		list=insert(list,12);
		list=insert(list,1);
		list=insert(list,4);
		list=insert(list,8);
		list=insert(list,15);
		list=insert(list,13);
		list=insert(list,6);
		print(list);

	}

}
