package sortingandsearching;

public class DoubleLinkedList {

	Node head;
	static class Node{
		int data;
		Node next,prev;//Reference Object
		Node (int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}

	}//Node class End

	public static DoubleLinkedList insert(DoubleLinkedList list, int data) {
		//create a new node with given data
		Node new_node=new Node(data);
		//if head is null- insert address of first node in head
		if(list.head==null) 
			list.head=new_node;

		else {
			Node last;
			for(last=list.head;last.next!=null;last=last.next) {}
			last.next=new_node;
			new_node.prev=last;

		}

		return list;
	}
	// Method to delete a node in the LinkedList by KEY
	public static DoubleLinkedList deleteByKey(DoubleLinkedList list, int key) {
		// Store head node
		Node last = list.head, prev = null;


		if(last.prev==null && key==last.data) {
			list.head=last.next;
			last.next.prev=null;

		}
		else {
			while(last!=null && key!=last.data){
				last=last.next;
			}	

			if(last!=null){
				if(last.next!=null)
					last.next.prev=last.prev;
				if(last.prev!=null)
					last.prev.next=last.next;
				System.out.println("Key Deleted");
			}

			if(last==null)
				System.out.println("Key not found"+key);

		}	
		return list;
	}


	public static void print(DoubleLinkedList list ) {
		for(Node last=list.head;last!=null;last=last.next) {
			System.out.print(last.data+" ");
		}
	}
	public static void printReverse(DoubleLinkedList list ) {
		System.out.println("\nReverse List");
		Node last;
		for(last=list.head;last.next!=null;last=last.next);

		for(;last!=null;last=last.prev) {
			System.out.print(last.data+" ");
		}
	}

	public static void main(String[] args) {
		DoubleLinkedList list=new DoubleLinkedList();
		list=insert(list,23);
		list=insert(list,12);
		list=insert(list,1);
		list=insert(list,4);
		list=insert(list,8);
		list=insert(list,15);
		list=insert(list,13);
		list=insert(list,6);
		print(list);
		printReverse(list);
		list=deleteByKey(list, 23);
		list=deleteByKey(list,8);
		print(list);

	}

}
