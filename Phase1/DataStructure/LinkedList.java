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
	public static LinkedList deleteByKey(LinkedList list, int key){
		Node currnode=list.head, prev=null;
		//delete first node
		if(currnode !=null && currnode.data==key) {
			list.head=currnode.next;
			System.out.println("Key deleted");
		}
		else {
			while(currnode !=null && currnode.data !=key) {
				prev=currnode;
				currnode=currnode.next;
				
			}
			if(currnode !=null) {
				prev.next=currnode.next;
				System.out.println("key deleted");
			}
			if(currnode==null) {
				System.out.println("key not found");
			}
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
		list=deleteByKey(list, 23);
		list=deleteByKey(list,8);
		print(list);

	}

}
